package camelcase;

public class StringHasInvalidCharacterException extends RuntimeException{
    public StringHasInvalidCharacterException(String msg) {
        super(msg);
    }
}
