package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__null_check_after_deref_01_good extends AbstractTestCase {
    public void good() throws Throwable {
        good1();
    }
    private void good1() throws Throwable {
        {
            String myString = null;
            myString = "Hello";
            IO.writeLine(myString.length());
            myString = "my, how I've changed";
            IO.writeLine(myString.length());
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
