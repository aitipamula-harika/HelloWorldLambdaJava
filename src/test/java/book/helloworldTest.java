package book;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloTest {
  @Test
  public void successfulResponse() {
    HelloWorld app = new HelloWorld();
    assertEquals("Here is test for Hello World String: ", "Hi prod", HelloWorld());
  }
}
