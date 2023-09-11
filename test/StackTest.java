import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private MyStack stack;
    @BeforeEach
    public void setup(){
        stack = new MyStack();
    }

    @Test
    public void createClassTest() throws Exception {
        assertNotNull(stack);
    }

    @Test
    public void newStack_IsEmpty() throws Exception {
        assertTrue( stack.isEmpty());
    }

    @Test
    public void pushTest() throws Exception{
        stack.push(0);
        assertFalse(stack.isEmpty());
    }

//    @Test(expected = MyStack.Overflow.class)
//    void willThrowUnderflow_WhenEmptyStackIsPopped() throws Exception{
//
//    }

    @Test
    public void afterOnePushAndOnePop_WillBeEmpty() throws Exception{
        stack.push(0);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void afterTwoPushAndOnePop_WillNotBeEmpty() throws Exception{
        stack.push(0);
        stack.push(0);
        stack.pop();
        assertFalse(stack.isEmpty());
    }

    @Test
    public void afterPushingX_WillPopX() throws Exception{
        stack.push(99);
        assertEquals(99, stack.pop());
        stack.push(88);
        assertEquals(88, stack.pop());
    }

    @Test
    public void afterPushingX_Twice_WillPopX() throws Exception{
        stack.push(99);
        stack.push(88);
        assertEquals(88, stack.pop());
        assertEquals(99, stack.pop());
    }


    @Test
    public void afterPushingX_Thrice_WillPopX() throws Exception{
        stack.push(99);
        stack.push(88);
        stack.push(88);
        assertEquals(88, stack.pop());
        assertEquals(88, stack.pop());
        assertEquals(99, stack.pop());
    }



}
