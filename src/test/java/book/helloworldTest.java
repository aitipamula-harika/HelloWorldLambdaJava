package book;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class HelloTest {
  @Test
  public void successfulResponse() {
    HelloWorld app = new HelloWorld();
    String content = result.getBody();
    assertNotNull(content);
    assertTrue(content.contains("\"Hi prod\""));
  }
}
