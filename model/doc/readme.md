
```drawio-resource
../cypher.drawio
```

[TOC levels=6]

An [Ecore](https://www.eclipse.org/modeling/emf/) model of the [Cypher](https://opencypher.org/) graph
query language: `.cypher` files loaded as typed abstract syntax trees.
It is one more instance of the language-as-a-model recipe the
[Java](https://java.models.nasdanika.org/), [Markdown](https://markdown.models.nasdanika.org/)
 and [SQL](https://sql.models.nasdanika.org/ast/index.html) source models established.
This model is where the loaded language is not a document to be analyzed but **an engine to be run**:
a Cypher statement can be a query over any Ecore model, a transition that rewrites one,
or an authoring surface that produces one.

Two things follow from the recipe and are worth stating at the top, because they are what the model is for.
First, the metamodel is **parser-neutral**: no parser types appear in it or in its API, so the
parser is a dependency choice rather than a design commitment.
Second, the metamodel is **engine-neutral** in exactly the same way: the same loaded statement can be matched
against an in-memory model, handed to Neo4j over bolt, or, eventually, evaluated in a browser.
The model is the asset. Parsers and engines are suppliers.

## Why Cypher, and why not a language of our own

**It comes with its tests.** The openCypher project publishes a Technology Compatibility Kit: executable
scenarios that decide whether an implementation is correct. Adopting Cypher means adopting a
specification *and* a test suite, neither of which we write and both of which can surprise us.

**Agents already write it.** Cypher is in every model's training data at scale, which makes it the cheapest
available interface between an assistant and a typed model estate. This is the same reasoning that
puts typed vocabularies in front of code generators elsewhere in the tower: the point is not that the
machine can express the query, it is that the machine gets it right and the type system catches it
when it does not.

**A pattern can be analyzed before it is run.** Which labels, properties and relationship types a
statement reads, and which it writes, is derivable from the syntax tree. Two statements can be compared
for overlap without executing either. A read-only statement is verifiably read-only. None of that is
true of a script, and all of it matters for the places in the tower where an expression is data that
travels: change templates, access control conditions, and catalogs shipped by third parties.

## Dialect

openCypher 9 is the baseline. It is what the TCK tests, and it is the common subset that Neo4j,
Memgraph, Apache AGE and Amazon Neptune all implement. Constructs added after it, such as `CALL`
subqueries and `EXISTS` subqueries, are present in the metamodel and marked as extensions, so that
conformance can be reported rather than implied.

The specification is not frozen, and the direction is good news rather than drift: openCypher released
through `1.0.0-M23` in July 2023 and then a 2024 series ending at 2024.3 in March 2024, adding label
expressions, quantified path patterns and `SHORTEST` explicitly as convergence with ISO GQL
([ISO/IEC 39075](https://www.iso.org/standard/76120.html)).
openCypher is being folded into the standard rather than abandoned for it,
so a baseline of 9 for the engine and the TCK sits under a grammar that has somewhere to go.

Almost all of that is additive against this metamodel and is left for when it is wanted.
Label expressions are the exception, because `:A&B`, `:A|B`, `:!A` and `:%` cannot be carried by a list of
strings and label matching appears in every query.
So `NodePattern`, `RelationshipPattern` and `LabelCheck` carry a contained `LabelExpression` tree,
into which openCypher 9's `:A:B` loads as a conjunction and `[:A|B]` as a disjunction.
Non-additive changes in a known roadmap are absorbed now; additive ones wait.

The `dialect` attribute on `CypherSource` records which spelling a file was authored in, because the
same text can be valid in several of them and mean different things.

## Competitive landscape

**Neo4j and the graph databases.** Cypher is normally inseparable from a database: you load your data
in, you query it there. This model separates the language from the store, which is the whole idea.
Nothing here competes with Neo4j; the Neo4j projection work will treat Neo4j as a derived,
disposable materialized view, and the same `.cypher` file can be run locally against the model or sent
to that projection over bolt.

**OCL** is the modeling world's default and it is a navigation language, not a pattern language: it
walks from a context object rather than binding several elements at once.
It is also ubiquitous and unloved, and nothing outside the modeling community reads it.

**Epsilon EOL and EPL** are mature and do much of this well. They are also Eclipse-platform work,
which is the ecosystem this project deliberately left, and their audience is the modeling community
rather than the people who have to use the models.

**VIATRA VQL** is the serious one and should be named as such: graph pattern matching over EMF with
incremental Rete evaluation, technically ahead of what is proposed here. The differences that justify
a different choice are not technical. VIATRA is Eclipse-shaped; its language is known to a few hundred
specialists while Cypher is known to hundreds of thousands of developers and to every assistant; and
its incremental evaluation solves live-model-change notification, which a Git-sourced model does not
have.

**The actual competitor** is a Java method with a nested loop in it, written once for one question,
living in one generator, invisible to everyone who might have wanted to ask a similar question.

## What a typed model adds

**Queries become artifacts.** A `.cypher` file is a named, documented, diffable, reviewable,
signable thing with provenance markers, rather than a string built at runtime in a generator.
That is the same move the Markdown and SQL models make for their formats, and it has the same consequence:
everything downstream, documentation, comparison, cross-referencing, is written against the model
rather than against the text.

**Static analysis of queries.** Read sets and write sets from the AST. Which queries touch this
feature, which would break if this class were renamed, which two transitions might conflict. Dead
query detection is the sibling of dead element detection elsewhere in the tower.

**One statement, several backends.** Because the loaded form is a model rather than a string, the same
statement can be matched in memory, translated to a Neo4j request, or compiled to something else
entirely. That is what makes "the query outlives the store" more than a slogan.

**An evaluator the tower can use without depending on it.** `CypherEvaluator` extends NxCore
`SourceEvaluator`, so any model feature typed as an `Evaluator` accepts a Cypher statement, and no
model above needs to know Cypher exists.

## Applications

**Cross-model queries.** Impact analysis, transitive closure, blast radius, shortest paths across the
tower's floors: which teams depend on this system of record, which controls cover this requirement,
what breaks if this vendor library has a CVE. These are the queries the tower was built to make
answerable, and they are painful and opaque written as Java streams or OCL.

**Cypher as an authoring surface.** Through the
[resource contents filter](https://docs.nasdanika.org/core/capability/resource-contents-filters.html)
mechanism, a `*.exec.cypher` resource can produce model contents rather than answer a question, which puts
Cypher alongside Markdown, Draw.io and Excel as a way to author a model.

**Contextual rendering.** The
[`WidgetFactory`](https://github.com/Nasdanika-Models/html-app/blob/main/graph/src/main/java/org/nasdanika/models/app/graph/WidgetFactory.java)
pattern asks an element for a UI component *resolved relative to the asker*, so a link comes back
with an href relative to where the question came from, and a credit card account and a mortgage
account answer the same request differently. It inverts the usual arrangement: instead of a layout
binding components to data paths, the layout asks each element for its rendering in a named role.
XSLT's `mode` is the precise precedent, CSS descendant selectors the familiar one, and the same
pattern already builds Draw.io and PlantUML context diagrams by asking a target for the node to
place in the source's own diagram.

It is also the same operation as a view requested by an agent, with a different result type: render
yourself, for this requester, in this role.  

**Wiring diagrams to semantic models.** A Draw.io drawing loads as a model, and the pass that turns
its shapes and connectors into semantic elements is today either hand-written Java or a mapping rule.
It is also a graph pattern: `MATCH` the diagram graph, `MERGE` into the semantic model. Written that
way the wiring is readable, an assistant can produce it, and it is analyzable, so which shapes a
mapping consumes and which types it produces are answerable without running it. One discipline makes
it sound, and it replaces the trace table that ATL and QVT carry for the same purpose: **the target
element's identity has to be a deterministic function of the source element's identity.** Given that,
`MERGE` brings an element into existence on first mention and finds it on every later one, so the
mapping is idempotent and order-independent, which is a stronger guarantee than a trace provides. The
NxCore URI scheme is already that convention. 

**Transitions.** In the occupancy design a variant is derived from a
base by applying a transition. A Cypher write statement is a readable way to author one, and because
`MATCH` is a match morphism in the sense every transformation language means it, the authored form
keeps the analyzability that a script loses. Executed against a model with an EMF `ChangeRecorder`
attached, it materializes a real, reversible `ChangeDescription`, which is the form the rest of the
tower prefers to carry. Cypher is therefore a front end to the change model, not a replacement for it.

**A query surface for agents.** An assistant answering a question about the estate writes Cypher
against a typed graph and gets rows back, instead of being handed a model API and a hope. Guard rails
are part of the design rather than an afterthought: read-only by default, a row budget, and a timeout,
because an unconstrained join is the easiest mistake in the language and a hang in a documentation
build looks exactly like a broken build. This is the largest application and has
[its own section](#cypher-as-the-agent-surface) below.

**Documenting a Cypher estate.** An organization with a graph database has `.cypher` files in
repositories, and nothing reads them. Parse them, document them, resolve their labels against the
model that defines them, and report the ones that reference things which no longer exist. Free once
the model exists, and it is the SQL source model's story with a different extension.

## Cypher as the agent surface

The usual way to give an assistant access to a model is a tool per capability: `getChildren`,
`getParent`, `getEClass`, `renderMarkdown`, `findDescendants`, and so on until the catalog is too
large to select from reliably and the prompt pays for every capability whether or not it is used.

The alternative here is one tool, because everything is already one graph:

```
Prompt      a metamodel summary, generated from what is actually in scope
Bindings    self, resource, resourceSet, scope
Tool        executeCypher(query)
Graph       a bounded projection: instances, metamodel, operations, views
```

```
MATCH (self)-[:children]->(c) RETURN c
MATCH (self)-[:eClass]->(c)-[:eAllStructuralFeatures]->(f) RETURN f.name, f.eType
MATCH (self)-[:descendants {depth: 3}]->(d) RETURN d
RETURN (self)-[:view {type: markdown, features: ['firstName', 'lastName']}) -> (m)
```

Three properties make this more than tool-count arithmetic.

**Capabilities are data, so the prompt stops going stale.** A new view or
operation is discoverable by traversal. Nothing in the prompt or the tool contract changes when the
system grows, which removes a maintenance cost that is otherwise paid in discipline forever.

**The metamodel is in the same graph as the model.** `EClassConnection` links an instance to its
`EClass`, so one query crosses from instances to types and back. Introspection needs no separate API
and an agent working on a metamodel uses the same surface as one working on instances.

**Operations and derived features are already edges.** `EOperationConnection` carries an operation
with its arguments, so a computed traversal and a stored reference look alike to whoever writes the
query. That similarity is the point: an agent should not have to know which relationships are stored,
derived, or computed on demand.

### The graph an agent sees is a flashlight beam

The query runs over a **semantic context**: a bounded projection of the resource set rather than all
of it. For small or unrestricted cases the context is everything. For large or restricted ones it is
a neighborhood, computed by breadth-first traversal from a seed and bounded by depth, by element
count, or by both, with the metamodel scoped to the classifiers actually instantiated inside it.

This is where the generality of an open query language stops being a liability. The size of the
decision an agent is making is set by the graph it can see, not by the size of the language or the
length of a tool catalog, so one projection bounds context cost, choice, and blast radius at once. A
six-hundred-class metamodel with twelve classes in play yields a twelve-class summary, which is both
the token answer and the reason the agent uses the right label names instead of guessing.

Two properties make a bounded world safe to reason in, and the first is easy to get wrong.

**The edge of the beam has to be visible.** If out-of-scope elements simply do not appear, an agent
asked what depends on a component will answer "nothing" when the truth is "nothing within four
hops", and it will answer confidently. So the boundary is made of **horizon stubs**: a node carrying
label, URI and name, with no outgoing edges, which says there is more here and you cannot see it
yet. A procedure widens the scope around a named node, so the visible world moves as the agent walks
through it. A truncated graph that is indistinguishable from a complete one is the worst failure
mode this surface can have, and stubs are what prevent it.

**The beam is also the permission boundary.** Where the bound is an access-control decision rather
than a budget, nothing outside it is in the graph at all, so no query reaches it regardless of what
the agent writes or what talked it into writing that. Containment by construction is a stronger
answer to prompt injection than inspecting statements one at a time, and it composes with the
[IAM floor](https://iam.models.nasdanika.org/)'s selectors and with the per-principal projection that the resource
contents filter mechanism already describes.

Read-only remains the default and remains statically verifiable, as defense in depth and because
writes need their own gate: a write capability is granted by the caller and is never something query
text can grant itself, the same rule as the execution qualifier in file names. Row budgets and
timeouts become backstops rather than the line of defense, which is the right role for a bound that
should never be reached.

`scope` is bound alongside the other context variables, so an agent can ask how large its world is
and whether it was truncated. An agent that knows it is holding a flashlight behaves differently
from one that believes it is standing in daylight.

Stubs handle navigation, and aggregates need one more rule, because there is no stub inside a
number: a count of dependents that returns three when there are seven is truncation that leaves no
trace in the result. So truncation is **edge-complete at the boundary**, meaning a boundary node's
edges are all present with stubs as their targets even though those stubs have none of their own,
which makes counts through the boundary correct. Where that cannot be guaranteed, the aggregate is
marked partial and the honest answer is "at least three".

### Boundary policies

The bounded world has a better name than scope: an **ecumene**, a known world, which says that this
is a world as known by somebody rather than an arbitrary truncation. How its edge is drawn is a
policy, and the policies form a ladder ordered by what is disclosed there.

| Policy | What is visible at the edge |
|---|---|
| Severed | Nothing. The world appears complete |
| Cardinal | A single node at infinity: there is more, and this much of it |
| Aggregated | That node plus collapsed edges carrying counts and statistics |
| Grouped | Several poles, one per class of a partition: three requirements and twelve comments, rather than fifteen things |
| Identified | A stub per external target, with URI and name and no further edges |
| Complete | No edge |

These are named points in a continuum rather than a fixed menu. The exterior is quotiented by an
equivalence relation and the policies differ only in how coarse it is: one pole is the coarsest
quotient, a stub per target is the finest, and grouping sits between them. The partition is
pluggable, and by classifier is the useful default because every node carries its `EClass` and
because **typed poles extend the metamodel summary past the horizon**, telling an agent which kinds
of thing exist out there when the in-scope summary cannot. Grouping by relationship type is often
better for a query agent, since the question is usually about a relationship rather than about a
target's type.

Grouped poles change what an agent can do rather than only what it knows. "Fifteen things you cannot
see" is unactionable; "three requirements and twelve comments" is a routing decision, and the agent
expands the requirements and ignores the comments. Poles may be linked to an ultimate pole to make
the refinement navigable, so an agent sees one pole, asks what is in it, and receives the typed ones.

**Poles are terminal.** They carry statistics about their contents as properties, including
relationships among collapsed members, and they have no traversable outgoing edges beyond the
refinement link. An edge between two poles would assert only that *some* member of one relates to
*some* member of the other, and a pattern match cannot tell that from a real edge, so a path drawn
through two poles reports a connection that may not exist. Paths through summary nodes are not
paths, and a boundary that manufactures plausible connections is worse than one that hides real
ones.

**The order is about disclosure, not only about size**, and the two ends serve opposite purposes.
Refinement and leakage run in the same direction: "fifteen relatives abroad" discloses less than
"one uncle, two nieces, twelve cousins", because each attribute of the grouping narrows the
candidate set. So a finer partition is more useful and more revealing by the same move, and picking
one is picking a point on that trade.
Where the boundary is a *budget*, mark it: honesty about truncation is the whole goal and silence
produces confident wrong answers. Where the boundary is a *permission*, sever it, including the
marker, because a node announcing "fifteen elements you may not see" has already disclosed that
there are fifteen. Counts over small populations re-identify, so at a permission boundary a count is
frequently the entire disclosure rather than a lesser one.

The engine cannot tell a budget from a permission, so the policy is declared per boundary and belongs
with the access control statements on the IAM floor rather than with the traversal budget.

Two rules follow. **A projection never asserts completeness it does not have**, so no unqualified
total over a truncated extent: "at least three", never "three". And **the node at infinity propagates
like `NaN`**: any row, path or aggregate that touched it carries a partiality marker, and the marker
survives projection and aggregation. That is what makes the previous rule automatic rather than
something a caller has to remember, and it makes the severed case a deliberate exception rather than
an accident.

### Cypher is one command form, not the interface

The parts of this that matter are one tool, a bounded scope, capabilities discoverable as data, and
a negotiated result type. The query language is a parameter of that design rather than the substance
of it, and other command forms are plausible for the same surface: a selector language for the many
interactions that are "fetch this" rather than "find things related this way", or a JSON command
object, which has the distinctive property that constrained decoding against a schema can make
malformed output impossible rather than merely detectable.

The abstraction that holds them is already in place and is not specific to this model: NxCore's
`Evaluator`, whose contract is `<T> T evaluate(Class<T> resultType, Map<String, Object> bindings)`,
with `SpelEvaluator`, `ScriptEvaluator`, `GroovyEvaluator` and `CypherEvaluator` as its existing
subtypes. A command form is an `Evaluator`; the scope and the context variables are bindings; the
representation is the result type.

Where more than one form exists they compile into this model and share one engine.
One set of scope rules, one diagnostics contract, one result shape.
The alternative, an evaluator per form, forks the semantics and then drifts.

### Packaging: an MCP server is a POM

Because the surface is one tool over a bounded graph, the natural way to ship it is
[MCP](https://modelcontextprotocol.io), and the pieces are largely in place: the
[MCP model](https://mcp.models.nasdanika.org/) already describes an interpretation runtime that walks a model and
registers capabilities with the Java SDK, taking metadata from the model and attaching execution
through bindings. A query tool is one such binding over a resource set.

What that makes possible is unusual. An MCP server today is code somebody installs. Here it is a
declarative composition of **published, versioned model artifacts** addressed by coordinates: a
capability model at one version, a target architecture at another, a risk model at a third. Adding
a model to an agent's reach is a dependency, not a deployment.

Version pinning is the part worth noticing. An agent querying a mutable endpoint gives a different
answer next week and cannot say why; an agent querying a pinned artifact gives an answer that can be
cited, re-run and audited. Reproducibility arrives as a property of the packaging rather than as a
feature.

Three design points govern the protocol boundary:

* **Resources and prompts, not only tools.** The metamodel summary is an MCP *resource* and the
  worked examples are a *prompt*. Putting a summary in a tool description makes it static and
  charges prompt tokens for it on every request.
* **Permission scope is server-side, budget scope is client-side.** Depth and element count are
  arguments an agent may pass. What it is allowed to see is not, or the containment property is
  gone.
* **Compose at load time, not at query time.** Cross-model questions are answered by a resource set
  holding several resolved models, with EMF resolving the references between them and one engine
  running the query. Protocol-level federation stays where it belongs, routing a call to another
  server and including one catalog in another, and no query spans two servers.

The same server can serve a **web console** beside the protocol endpoint, rendering results as
tables, graphs or Markdown through the same result-type negotiation, next to the generated
documentation for the model it queries. That is worth doing early, not last: an MCP endpoint cannot
be screenshotted or handed to someone as a link, and a query console can. It also means humans and
agents interrogate the model through one interface.

This is also why a query language beats letting an agent write general code. Cypher has no
filesystem, no reflection and no host access except through procedures the registry controls, and
whether a statement writes is decidable before it runs. For an agent surface that is not a
limitation, it is the containment strategy.

## Model overview

| Area | Types |
|---|---|
| Root | `CypherSource`: verbatim `source`, `parsed`, `dialect`, ordered `statements` |
| Statements | `Statement`, `Query` (`explain`, `profile`), `SingleQuery`, `Union`, `UnparsedStatement` with text and error |
| Reading clauses | `MatchClause` (`optional`, pattern, where), `UnwindClause`, `CallClause` with `YIELD` and optional subquery |
| Projection | `ProjectionClause` (`distinct`, `all`, items, order, skip, limit), `ReturnClause`, `WithClause` (adds `where`), `ProjectionItem`, `SortItem` |
| Writing clauses | `CreateClause`, `MergeClause` with `MergeAction`, `SetClause` (`SetProperty`, `SetVariable`, `SetLabels`), `RemoveClause`, `DeleteClause` (`detach`), `ForeachClause` |
| Patterns | `Pattern`, `PatternPart` (path variable, `PathSelector`), `NodePattern`, `PathConcatenation`, `RelationshipPattern` (`Direction`, variable length with `minHops`/`maxHops`) |
| Labels and types | `LabelExpression`: `LabelName`, `LabelConjunction`, `LabelDisjunction`, `LabelNegation`, `LabelWildcard`. Used by `NodePattern`, `RelationshipPattern` and `LabelCheck`; null means unconstrained |
| Expressions | `Variable`, `Parameter`, literals (string, integer, float, boolean, null, list, map), `PropertyAccess`, `LabelCheck`, `BinaryExpression`, `UnaryExpression`, `FunctionInvocation`, `CaseExpression`, `ListComprehension`, `PatternComprehension`, `QuantifiedExpression`, `ExistsExpression`, `Subscript`, `SliceExpression` |
| Evaluator | `CypherEvaluator extends SourceEvaluator`: parsed `statement`, `readOnly` (default true), `rowLimit`, `timeout` |
| Reused, not redefined | NxCore `ModelElement`, `Marked`, `SourceEvaluator` |

Every node is `Marked`, so line and column survive into diagnostics and into generated documentation.
A statement the parser rejects becomes an `UnparsedStatement` rather than failing the load: a file
always loads, and partial understanding is visible instead of fatal.

## How a model looks as a property graph

The engine matches patterns against the graph produced by the
[`org.nasdanika.graph.emf`](https://github.com/Nasdanika/core/tree/master/graph/src/main/java/org/nasdanika/graph/emf)
layer, which already turns an `EObject` tree into nodes and connections and which already carries most
of what a pattern matcher needs. The mapping is reflective, and the conventions below are part of the
contract rather than implementation detail, because a query author has to know them.

* **Labels** are the `EClass` name plus the names of all of its supertypes, so `MATCH (e:NamedElement)`
  matches everything in the tower and `MATCH (p:Person)` matches one floor, with no query-side knowledge
  of the hierarchy.
* **Properties** are `EAttribute` values, which is what `EObjectNode.getProperty` returns and nothing
  else. Contained objects with no independent identity, a marker, a documentation section, an amount,
  are nodes in the graph and properties in the author's head; a declared flattening policy per model
  closes that gap.
* **Relationship types** are `EReference` names, and **order is preserved**.
  `EReferenceConnection` carries the reference and an index (-1 for single-valued references) and is
  `Comparable`, so a node's connections come back in model order by default. `r.index` is there for a
  query that wants to say so explicitly. A property graph cannot do this at all.
* **Containment, container and cross-reference are distinguishable.** The containment flag comes from
  the reference itself, and `EContainerConnection` gives the upward edge its own class. Whether untyped
  traversal (`-[*]->`) follows containment and container edges is a published ruling rather than an
  accident. Cycles are not a hazard: Cypher does not traverse the same relationship twice within one
  path, so a graph with edges in both directions terminates on its own.
* **Operations are reachable.** `EOperationConnection` models an invocation, with the operation, its
  arguments and an index, so a zero-argument operation is simply a relationship type. Parameterized
  operations are virtual connections with arguments passed as selectors.
* **The metamodel is in the same graph as the model.** `EClassConnection` links an instance to its
  `EClass`, so `MATCH (o)-[:eClass]->(c)-[:eSuperTypes*]->(s)` is a legal question and instances can be
  queried together with their types. 
* **Derived features** are computed on access, the other advantage a live engine has over an exported
  graph, which has to freeze derived values at export time.
* **Identity** is the NxCore URI scheme, which is what makes `MERGE` idempotent and what lets
  independently authored models converge on the same element.
* **`CREATE` places new objects in the resource contents**, unless something in the same statement
  contains them, which is how the Draw.io loader already behaves and how EMF resources already work.
  If a statment has a return clause then the return result is added to the resource contents (root objects). 
  A failed statement produces an error on the resource.
* **`DETACH DELETE`** is `EcoreUtil.delete` with cross references cleaned up. Plain `DELETE` refuses to
  strand references, which is EMF's own posture.

## Loading

The loader follows the recipe: borrow a parser, keep its types out of the model, and put the only
parser-specific code behind a neutral entry point.

The parser is generated with [ANTLR](https://www.antlr.org/), from the grammar openCypher generates
from its own source of truth. The `.g4` is not checked into the openCypher repository because it is a
build output: at tag [`1.0.0-M23`](https://github.com/opencypher/openCypher/tree/1.0.0-M23/grammar)
the grammar lives as XML and the README documents the generator that emits it,
`Antlr4 cypher.xml > grammar/generated/Cypher.g4`, under Apache 2.0. The generated file is committed
here as a build artifact with the tag and commit it came from recorded beside it.

Generating rather than borrowing is what keeps the grammar's rules in one-to-one correspondence with
the named productions of the specification, which is in turn what makes the loader mechanical and
makes coverage measurable against something other than an opinion. The community grammar in
[`antlr/grammars-v4/cypher`](https://github.com/antlr/grammars-v4/tree/master/cypher) is permissively
licensed and would work, but it is an independent grammar with no stated relationship to any version
of the specification, and adopting it would cost exactly the property this model is built around.

The runtime dependency is `antlr4-runtime` alone. The same grammar compiles to a TypeScript parser
through `antlr4ng` if a browser engine is ever wanted: one grammar, two targets. The Scala openCypher
front-end (`org.opencypher:parser-9.0`) is Apache 2.0 and was considered; it is not used, because it
brings parboiled and a 2021 Scala binary line into a modular Java build.

Statements are split and parsed independently so that one unusual construct costs one statement rather
than the whole file, and diagnostics are collected on the resource.

`save()` un-parses the model back to Cypher. Phase one normalizes formatting rather than achieving a
byte-exact round trip, and re-emits the verbatim source unchanged when nothing structural was modified.

## Resources and file names

**`.cypher` is the source extension.** The registered `ResourceFactory` parses it into a
`CypherSource`: statements, patterns, expressions, markers. Nothing runs. Loading a `.cypher`
resource is always safe, whatever the file contains, which is a property worth being able to state
in one sentence.

**Execution is a qualifier, not a second extension.** A script whose write clauses are meant to
produce model contents is named `*.exec.cypher` and goes through the
[resource contents filter](https://docs.nasdanika.org/core/capability/resource-contents-filters.html)
chain, read right to left exactly as `my-product.pm.md` and `internet-banking-system.c4.drawio` are:
the `.cypher` factory loads the syntax tree, then the `exec` filter evaluates it and the resource
contents become whatever the `CREATE` and `MERGE` clauses produced. Because it is a chain it
composes, so `wiring.html.exec.cypher` executes and then renders, and because the name still ends in
`.cypher` every editor, forge and linter continues to treat the file as Cypher.

Unlike `pm` and `c4`, this qualifier names an action rather than a target model. That asymmetry is
deliberate: what a Cypher script produces is decided by its own write clauses, not fixed by the
filter that runs it.

A distinct extension for the executable form was considered and rejected. Two file types whose names
differ by one adjacent keystroke, where one only reads and the other writes to your model, is a poor
safety property for a model whose default is `readOnly` and whose catalogs are meant to be loaded
from strangers. The dangerous form should differ by a visible word.

## Execution

The engine is a separate module, resolved as a capability, and it is the expensive half of this work.
It is designed as a lazy pipeline of operators with a synchronous pull interface and a
`Flow.Publisher` adapter over the same pipeline, rather than as two engines. Laziness is what makes
`LIMIT` cheap on a large model and what makes the pipeline breakers (`ORDER BY`, `DISTINCT`,
aggregation, `collect`) visible as the places that buffer. Demand-driven flow earns its keep when a
query spans lazily loaded resources or a remote backend, and it costs nothing when it does not.

No cost-based optimizer is planned. Models at tower scale are thousands to low millions of nodes in
memory, so nested-loop matching with a label index and a starting-point heuristic is enough, and the
guards that matter are the row budget and the timeout rather than a planner.
Once a provider is remote, a nested loop that drives from the remote side issues
one call per candidate row, so providers supply a cardinality estimate and the planner orders joins on
it. That is join ordering, not a cost-based optimizer, and it is what keeps a rate-limited backend from
turning a fast query into a throttled one.

The graph the engine matches against reaches it through a `GraphContentProvider`, in the spirit of the
JFace `TreeContentProvider`: the engine matches patterns and never learns what the nodes actually are.
The EMF projection is the first provider rather than the substrate, and the others worth having early
are the JVM module system, SQL catalogs, and issue and repository trackers, none of which have a
convenient query surface today.
A Bolt server on top would let Neo4j drivers and browsers connect to the engine as a client.

Conformance is reported as a fraction of the openCypher TCK, with the unsupported list published
alongside it.

## Relation to other Nasdanika work

Base classes come from [NxCore](https://nxcore.models.nasdanika.org/): `ModelElement` for the resource
root, `Marked` for every syntax node, and `SourceEvaluator` for `CypherEvaluator`, which is the single
point of contact by which the rest of the tower uses Cypher without depending on it.
The graph the engine matches against is the `org.nasdanika.graph.emf` projection that already exists.
Authoring through [resource contents filters](https://docs.nasdanika.org/core/capability/resource-contents-filters.html)
puts Cypher next to Markdown, Draw.io and Excel as a way to produce model contents.
The [Meta model](https://meta.models.nasdanika.org/) and its TypeScript projection are what a browser engine would match
against, with one prerequisite: TypeScript types are erased at runtime, so the projection would have to
emit a runtime descriptor per class before `MATCH (p:Person)` means anything in a browser.

As a language loaded into a model, it sits beside the Markdown model and the SQL source model rather
than on a floor of the tower. It is not a floor. It is a tool the floors can use.
