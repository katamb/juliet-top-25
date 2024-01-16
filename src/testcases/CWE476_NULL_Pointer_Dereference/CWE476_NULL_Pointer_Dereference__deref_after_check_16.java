package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__deref_after_check_16 extends AbstractTestCase {
    public void bad() throws Throwable {
        while (true) {
            {
                String myString = null;
                if (myString == null) {
                    IO.writeLine(myString.length());
                }
            }
            break;
        }
    }
    private void good1() throws Throwable {
        while (true) {
            {
                String myString = null;
                if (myString == null) {
                    IO.writeLine("The string is null");
                }
            }
            break;
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