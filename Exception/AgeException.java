public class AgeException extends Exception{
    public AgeException() {
        super();
    }

    public AgeException(String msg) {
        super(msg);
    }

    public AgeException(String msg, Exception causeException) {
        super(msg,causeException);
    }
}
