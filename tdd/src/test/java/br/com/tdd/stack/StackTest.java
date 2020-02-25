package br.com.tdd.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void emptyStack(){
        Stack s = new Stack();
        assertTrue(s.isEmpty());
        assertEquals(0, s.size());
    }

    @Test
    public void pushAElement(){
        String e = "first element";

        Stack s = new Stack();
        s.push(e);
        assertFalse(s.isEmpty());
        assertEquals(1, s.size());
        assertEquals(e, s.peek());
    }

}
