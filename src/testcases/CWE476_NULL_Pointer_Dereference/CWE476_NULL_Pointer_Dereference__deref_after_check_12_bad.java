package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__deref_after_check_12_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        if (IO.staticReturnsTrueOrFalse()) {
            {
                String myString = null;
                if (myString == null) {
                    IO.writeLine(myString.length());
                }
            }
        } else {
            {
                String myString = null;
                if (myString == null) {
                    IO.writeLine("The string is null");
                }
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
