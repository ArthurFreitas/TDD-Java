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
        Stack s = new Stack();
        s.push("first");
        assertFalse(s.isEmpty());
        assertEquals(1, s.size());
        assertEquals("first", s.peek());
    }

    @Test
    public void pushTwoElements(){
        Stack s = new Stack();
        s.push("first");
        s.push("second");
        assertFalse(s.isEmpty());
        assertEquals(2, s.size());
        assertEquals("second", s.peek());
    }

    @Test
    public void pushTwoElementsAndPop(){
        Stack s = new Stack();
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
}
