import com.pyruz.controller.HelloWorldController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class JUnitHelloWorldControllerTest {

    @Test
    public void testHelloWorldController() {
        HelloWorldController helloWorldController = new HelloWorldController();
        String result = helloWorldController.hello();
        assertEquals(result, "Hello world!");
    }
}