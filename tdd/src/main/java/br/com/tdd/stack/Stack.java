package br.com.tdd.stack;

public final class Stack {
    private Object e;
    private int count;

    public Stack() {
        this.count = 0;
    }
    
	public boolean isEmpty() {
		return e == null;
	}

	public int size() {
		return this.count;
	}

	public void push(Object e) {
        this.e = e;
        this.count ++;
    }
    
    public Object peek(){
        return e;
    }
}
