package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__null_check_after_deref_17_good extends AbstractTestCase {
    private void good1() throws Throwable {
        for (int k = 0; k < 1; k++) {
            {
                String myString = null;
                myString = "Hello";
                IO.writeLine(myString.length());
                myString = "my, how I've changed";
                IO.writeLine(myString.length());
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
