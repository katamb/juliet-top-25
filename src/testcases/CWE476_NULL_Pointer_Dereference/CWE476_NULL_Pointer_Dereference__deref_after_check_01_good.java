package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__deref_after_check_01_good extends AbstractTestCase {
    public void good() throws Throwable {
        good1();
    }
    private void good1() throws Throwable {
        {
            String myString = null;
            if (myString == null) {
                IO.writeLine("The string is null");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
