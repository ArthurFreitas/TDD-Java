package stack;

public final class Stack {
    private Object[] elements;
    private int count;

	public Stack(int maxSize) {
        this.count = 0;
        elements = new Object[maxSize];
    }
    
    public void push(Object e) {
        if(isFull())
            throw new FullStackException("The stack is full");
        this.elements[this.count] = e;
        this.count ++;
    }

    public boolean isFull(){
        return this.count == elements.length;
    }

    public Object pop() {
        if(isEmpty())
            throw new EmptyStackException("The stack is empty");
        Object topElement = peek();
        this.count --;
        return topElement;
	}

	public boolean isEmpty() {
		return this.count == 0;
    }

    public Object peek(){
        return this.elements[this.count -1];
    }

	public int size() {
		return this.count;
	}
}
