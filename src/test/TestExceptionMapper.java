package test;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class TestExceptionMapper implements ExceptionMapper<TestException>  {

	@Override
	public Response toResponse(TestException e) {
		return Response.status(405).entity(e.getMessage()).type(MediaType.TEXT_PLAIN).build();
	}
}