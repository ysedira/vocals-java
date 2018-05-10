package it.polimi.rsp.mock;

import lombok.Getter;
import org.apache.commons.rdf.api.IRI;

public class VOCALS {
    private static final org.apache.commons.rdf.api.RDF RDF = RDFFactory.getInstance(RDFImplementation.SIMPLE);
    @Getter
    private static final String uri = "http://w3id.org/rsp/vocals#";

    public static final IRI RDF_SSTREAM = resource("RDFStream");
    public static final IRI STREAM_ = resource("Stream");
    public static final IRI STREAM_DESCRIPTOR = resource("StreamDescriptor");
    public static final IRI STREAM_DISTRIBUTION = resource("StreamDistribution");
    public static final IRI STREAM_ENDPOINT = resource("StreamEndpoint");
    public static final IRI STREAM_PARTITION = resource("StreamPartition");
    public static final IRI FEATURE = resource("feature");
    public static final IRI PREVIOUS = resource("previous");
    public static final IRI HAS_STREAM = resource("stream");
    public static final IRI HAS_ENDPOINT = resource("hasEndpoint");
    public static final IRI HAS_PARTITION = resource("hasPartition");

    private static IRI resource(String local) {
        return RDF.createIRI(uri + local);
    }

}
