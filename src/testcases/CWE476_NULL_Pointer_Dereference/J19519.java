package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19519 extends AbstractTestCase {
    private boolean privateReturnsTrue() {
        return true;
    }
    private boolean privateReturnsFalse() {
        return false;
    }
    private void process1() throws Throwable {
        if (privateReturnsFalse()) {
            IO.writeLine("Benign, fixed string");
        } else {
            {
                String myString = null;
                if ((myString != null) && (myString.length() > 0)) {
                    IO.writeLine("The string length is greater than 0");
                }
            }
        }
    }
    private void g2() throws Throwable {
        if (privateReturnsTrue()) {
            {
                String myString = null;
                if ((myString != null) && (myString.length() > 0)) {
                    IO.writeLine("The string length is greater than 0");
                }
            }
        }
    }
    public void process() throws Throwable {
        process1();
        g2();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
