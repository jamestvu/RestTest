package test;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
    public TestObject getTestMessage() {
    	TestObject to = new TestObject(1, "james");
    	return to;
    }
}