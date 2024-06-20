import static org.junit.Assert.assertTrue;
import org.junit.Test;
/*
 * Additional test cases include poping more items and poping from an empty stack
 */

public class myStackTest {
    @Test
    public void testIsempty() {
        myStack<String> testStack = new myStack<>();
        assertTrue("myStack: isempty Failure", testStack.isempty() == true);
    }

    @Test
    public void testPop() {
        myStack<String> testStack = new myStack<>();
        testStack.add("kitty");
        testStack.add("puppy");
        testStack.add("gosling");
        testStack.add("baby");

        String testString = testStack.pop();
        assertTrue("myStack: pop Failure", testString == "baby");
        assertTrue("myStack: pop Failure", testStack.size() == 3);
    }
}
