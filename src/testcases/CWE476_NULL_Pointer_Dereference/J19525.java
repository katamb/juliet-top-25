package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19525 extends AbstractTestCase {
    private void process1() throws Throwable {
        if (IO.staticReturnsFalse()) {
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
    private void good2() throws Throwable {
        if (IO.staticReturnsTrue()) {
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
        good2();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
