package exceptions;

public class ToManyArgumentsException extends UnsupportedOperationException {
    public ToManyArgumentsException(String message) {
        super(message);
    }
}