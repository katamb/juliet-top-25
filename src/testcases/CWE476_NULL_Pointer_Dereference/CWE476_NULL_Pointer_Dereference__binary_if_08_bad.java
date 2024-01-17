package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__binary_if_08_bad extends AbstractTestCase {
    private boolean privateReturnsTrue() {
        return true;
    }
    private boolean privateReturnsFalse() {
        return false;
    }
    public void bad() throws Throwable {
        if (privateReturnsTrue()) {
            {
                String myString = null;
                if ((myString != null) & (myString.length() > 0)) {
                    IO.writeLine("The string length is greater than 0");
                }
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
