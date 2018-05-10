package it.polimi.rsp.mock;

import org.apache.commons.rdf.api.RDF;
import org.apache.commons.rdf.jena.JenaRDF;
import org.apache.commons.rdf.rdf4j.RDF4J;
import org.apache.commons.rdf.simple.SimpleRDF;

class RDFFactory {
    static RDF getInstance(RDFImplementation implementation) {
        switch (implementation) {
            case JENA:
                return new JenaRDF();
            case RDF4J:
                return new RDF4J();
            case SIMPLE:
                return new SimpleRDF();
            default:
                return new SimpleRDF();
        }

    }
}
