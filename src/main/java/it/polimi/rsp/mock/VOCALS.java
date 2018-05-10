package it.polimi.rsp.mock;

import lombok.Getter;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;

public class VOCALS {

    @Getter
    private static final String uri = "http://w3id.org/rsp/vocals#";

    public static final Resource RDF_SSTREAM = resource("RDFStream");
    public static final Resource STREAM_ = resource("Stream");
    public static final Resource STREAM_DESCRIPTOR = resource("StreamDescriptor");
    public static final Resource STREAM_DISTRIBUTION = resource("StreamDistribution");
    public static final Resource STREAM_ENDPOINT = resource("StreamEndpoint");
    public static final Resource STREAM_PARTITION = resource("StreamPartition");

    public static final Property FEATURE = property("feature");
    public static final Property PREVIOUS = property("previous");
    public static final Property HAS_STREAM = property("stream");
    public static final Property HAS_ENDPOINT = property("hasEndpoint");
    public static final Property HAS_PARTITION = property("hasPartition");

    private static Resource resource(String local) {
        return ResourceFactory.createResource(uri + local);
    }

    private static Property property(String local) {
        return ResourceFactory.createProperty(uri, local);
    }
}
