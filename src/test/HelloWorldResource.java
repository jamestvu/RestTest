package test;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test")
public class HelloWorldResource {
    
    @GET
    @Produces("text/plain")
    public String sayHello() {
        return "Hello World";
    }

    @GET
    @Path("message")
    @Produces(MediaType.APPLICATION_JSON)
    public String getTestMessage() throws WebApplicationException {
        return "Test message xd";
    }
    
    @GET
    @Path("object")
    @Produces(MediaType.APPLICATION_JSON)
    public TestObject getTestObjet() throws WebApplicationException {
    	TestObject to = new TestObject(1, "james");
    	return to;
    }

    @GET
    @Path("exception")
    @Produces(MediaType.APPLICATION_JSON)
    public TestObject getTestException() throws WebApplicationException {
    		throw new WebApplicationException(Response.status(Response.Status.NOT_ACCEPTABLE).entity(null).build());
    }
}