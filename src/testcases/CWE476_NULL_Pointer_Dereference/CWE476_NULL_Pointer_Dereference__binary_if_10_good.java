package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__binary_if_10_good extends AbstractTestCase {
    private void good1() throws Throwable {
        if (IO.staticFalse) {
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
        if (IO.staticTrue) {
            {
                String myString = null;
                if ((myString != null) && (myString.length() > 0)) {
                    IO.writeLine("The string length is greater than 0");
                }
            }
        }
    }
    public void good() throws Throwable {
        good1();
        good2();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
