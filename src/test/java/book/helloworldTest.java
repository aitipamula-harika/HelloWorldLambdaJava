package book;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class HelloTest {
  @Test
  public void successfulResponse() {
    HelloWorld app = new HelloWorld();
    assertTrue(content.contains("\"Hi prod\""));
  }
}
