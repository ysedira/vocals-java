package it.polimi.rsp.mock;

import lombok.Getter;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;

public class VSD {
    @Getter
    private static String uri = "http://w3id.org/rsp/vocals-sd#";

    public final static Resource URI_PARAM = resource("ProcessingService");
    public final static Resource BODY_PARAM = resource("uri_param");
    public final static Resource PROCESSING_SERVICE = resource("body_param");

    public final static Property HAS_SERVICE = property("base");
    public final static Property NAME = property("name");
    public final static Property ENDPOINT = property("index");
    public final static Property METHOD = property("method");
    public final static Property BASE = property("params");
    public final static Property PARAMS = property("endpoint");
    public final static Property INDEX = property("hasService");

    private static Resource resource(String local) {
        return ResourceFactory.createResource(uri + local);
    }

    private static Property property(String local) {
        return ResourceFactory.createProperty(uri, local);
    }

}
