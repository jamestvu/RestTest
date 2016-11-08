package test;

public class TestException extends Exception  {
	private static final long serialVersionUID = 100L;
	
	private String message;
	
	public TestException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}