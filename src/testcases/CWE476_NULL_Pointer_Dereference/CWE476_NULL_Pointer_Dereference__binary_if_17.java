package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__binary_if_17 extends AbstractTestCase {
    public void bad() throws Throwable {
        for (int j = 0; j < 1; j++) {
            {
                String myString = null;
                if ((myString != null) & (myString.length() > 0)) {
                    IO.writeLine("The string length is greater than 0");
                }
            }
        }
    }
    private void good1() throws Throwable {
        for (int k = 0; k < 1; k++) {
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
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}