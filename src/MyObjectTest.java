import org.junit.Test;
import static org.junit.Assert.assertTrue;

/*
 * testColor & testGetColor also test class instantiation
 * testSetColor has to either use Color or getColor given that USAColor is private
 * Additional tests could include instantiating with other variable types
 */

public class MyObjectTest {
    @Test
    public void testColor() {
        MyObject testObject = new MyObject("Green");
        assertTrue("MyObject: Color() Failure", testObject.Color() == "Green");
    }

    @Test
    public void testGetColor() {
        MyObject testObject = new MyObject("Green");
        assertTrue("MyObject: getColor() Failure", testObject.getColor() == "Green");
    }

    @Test
    public void testSetColor() {
        MyObject testObject = new MyObject();
        testObject.setColor("Green");
        assertTrue("MyObject: SetColor Failure", testObject.Color() == "Green");
    }
}
