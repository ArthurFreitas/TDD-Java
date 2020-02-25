package br.com.tdd.stack;

public final class Stack {
    private Object[] elements;
    private int count;

	public Stack(int maxSize) {
        this.count = 0;
        elements = new Object[maxSize];
	}

	public boolean isEmpty() {
		return this.count == 0;
	}

	public int size() {
		return this.count;
	}

	public void push(Object e) {
        this.elements[this.count] = e;
        this.count ++;
    }
    
    public Object peek(){
        return this.elements[this.count -1];
    }

	public Object pop() {
        Object topElement = peek();
        this.count --;
        return topElement;
	}
}
