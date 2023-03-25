package ExceptionHandling.Checked;

public class StackOverflowException extends Exception{
    @Override
    public String toString() {
        return "STACK IS OVERFLOWN";
    }
}
