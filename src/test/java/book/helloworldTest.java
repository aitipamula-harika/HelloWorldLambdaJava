package helloworld;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class HelloTest {
  @Test
  public void successfulResponse() {
    HelloWorld app = new HelloWorld();
    assertEquals(result.getStatusCode(), 200);
    assertNotNull(content);
    assertTrue(content.contains("\"hello world\""));
  }
}
