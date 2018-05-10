package it.polimi.rsp.mock;

import lombok.Getter;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;

public class VPROV {
    @Getter
    private static final String uri = "http://w3id.org/rsp/vocals-prov#";

    public static final Resource FILTER_OPERATOR = resource("FilterOperator");
    public static final Resource OPERATOR = resource("Operator");
    public static final Resource PHYSICAL_WINDOW = resource("PhysicalWindow");
    public static final Resource R2R_OPERATOR = resource("R2ROperator");
    public static final Resource R2S_OPERATOR = resource("R2SOperator");
    public static final Resource RSPQL_OPERATOR = resource("RSPQLOperator");
    public static final Resource REPLAY = resource("Replay");
    public static final Resource S2R_OPERATOR = resource("S2ROperator");
    public static final Resource S2S_OPERATOR = resource("S2SOperator");
    public static final Resource SET_OPERATOR = resource("SetOperator");
    public static final Resource STREAMING_AGENT = resource("StreamingAgent");
    public static final Resource TASK = resource("Task");
    public static final Resource TIME_BASED_WINDOW = resource("TimeBasedWindow");
    public static final Resource TRANSFORM_OPERATOR = resource("TransformOperator");
    public static final Resource WINDOW = resource("Window");
    public static final Resource WINDOW_OPERATOR = resource("WindowOperator");

    public static final Property CONTAINED_IN = property("containedIn");
    public static final Property CONTAINS = property("contains");
    public static final Property ENDED_AT = property("endedAt");
    public static final Property FOLLOWED_BY = property("followedBy");
    public static final Property HAS_OUTPUT = property("hasOutput");
    public static final Property PERFORMS = property("performs");
    public static final Property PRECEDED_BY = property("precededBy");
    public static final Property STARTED_AT = property("startedAt");
    public static final Property STARTING_TIME = property("startingTime");

    public static final Property QUERY = property("query");
    public static final Property RANGE = property("range");
    public static final Property STEP = property("step");

    private static Resource resource(String local) {
        return ResourceFactory.createResource(uri + local);
    }

    private static Property property(String local) {
        return ResourceFactory.createProperty(uri, local);
    }

}
