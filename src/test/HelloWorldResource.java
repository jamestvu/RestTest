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
    @Path("testMessage")
    @Produces(MediaType.APPLICATION_JSON)
    public TestObject getTestMessage() throws WebApplicationException {
    	TestObject to = new TestObject(1, "james");
    	if (to != null) {
    		TestObject test = new TestObject(33, "gorilla");
    		throw new WebApplicationException(Response.status(Response.Status.NOT_ACCEPTABLE).entity(test).build());
    	}
    	return to;
    }
}