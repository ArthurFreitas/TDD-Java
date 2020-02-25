package br.com.tdd.stack;

public class EmptyStackException extends RuntimeException{
    public EmptyStackException(String msg) {
        super(msg);
    }
}
