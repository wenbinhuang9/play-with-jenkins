
import  org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void testHelloWorld() {
        HelloWorld h = new HelloWorld();

        assertEquals("Hello Jenkins", h.helloJenkins());
    }


}
