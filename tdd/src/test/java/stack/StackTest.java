package stack;

import org.junit.*;
import static org.junit.Assert.*;

public class StackTest {
    private final int MAX_STACK_SIZE = 10;
    private Stack s;

    @Before
    public void initStack(){
        s = new Stack(MAX_STACK_SIZE);
    }

    @Test
    public void emptyStack(){
        assertTrue(s.isEmpty());
        assertEquals(0, s.size());
    }

    @Test
    public void pushAElement(){
        s.push("first");
        assertFalse(s.isEmpty());
        assertEquals(1, s.size());
        assertEquals("first", s.peek());
    }

    @Test
    public void pushTwoElements(){
        s.push("first");
        s.push("second");
        assertFalse(s.isEmpty());
        assertEquals(2, s.size());
        assertEquals("second", s.peek());
    }

    @Test
    public void pushTwoElementsAndPop(){
        String e1 = "first";
        String e2 = "second";
        s.push(e1);
        s.push(e2);
        assertEquals(2, s.size());
        assertEquals(e2, s.peek());

        Object poppedElement = s.pop();
        assertEquals(1, s.size());
        assertEquals(e1, s.peek());
        assertEquals(poppedElement, e2);
    }

    @Test(expected = EmptyStackException.class)
    public void removeFromEmptyStack(){
        s.pop();
    }

    @Test
    public void addToAFullStack(){
        for(int i = 0; i < MAX_STACK_SIZE; i++){
            s.push("element" + i);
        }
        try {
            s.push("overflowed element");
            fail();
        } catch (FullStackException e) {}
    }
}
