package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__null_check_after_deref_03_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        if (5 == 5) {
            {
                String myString = null;
                myString = "Hello";
                IO.writeLine(myString.length());
                if (myString != null) {
                    myString = "my, how I've changed";
                }
                IO.writeLine(myString.length());
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
