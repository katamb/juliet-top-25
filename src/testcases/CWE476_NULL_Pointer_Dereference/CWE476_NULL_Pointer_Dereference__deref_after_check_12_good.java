package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__deref_after_check_12_good extends AbstractTestCase {
    private void good1() throws Throwable {
        if (IO.staticReturnsTrueOrFalse()) {
            {
                String myString = null;
                if (myString == null) {
                    IO.writeLine("The string is null");
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
    public void good() throws Throwable {
        good1();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
