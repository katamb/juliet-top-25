package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__deref_after_check_11_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        if (IO.staticReturnsTrue()) {
            {
                String myString = null;
                if (myString == null) {
                    IO.writeLine(myString.length());
                }
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
