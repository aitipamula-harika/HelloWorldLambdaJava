package book;

import static org.junit.Assert.*;

import org.junit.Test;

public class helloworldTest {

	@Test
	  public void successfulResponse() {
	    HelloWorld app = new HelloWorld();
	    String str = app.handler("Hi,abc");//override in class as prod
	    System.out.println(str);
	    assertEquals("abc", str);
	  }

} 
