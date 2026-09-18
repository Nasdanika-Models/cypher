import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.cypher.capability.CypherArrayResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.cypher.capability.CypherEPackageResourceSetCapabilityFactory;
import org.nasdanika.models.cypher.capability.CypherResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.cypher.capability.CypherResourceFactoryCapabilityFactory;

module org.nasdanika.models.cypher {
	
	exports org.nasdanika.models.cypher;
	exports org.nasdanika.models.cypher.impl;
	exports org.nasdanika.models.cypher.util;
//	exports org.nasdanika.models.cypher.loader;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.models.nxcore;
	
	provides CapabilityFactory with 
		CypherEPackageResourceSetCapabilityFactory,
		CypherResourceFactoryCapabilityFactory,
		CypherResourceContentsHandlerCapabilityFactory,
		CypherArrayResourceContentsHandlerCapabilityFactory;
	
}