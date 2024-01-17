package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__deref_after_check_15_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        switch (7) {
            case 7: {
                String myString = null;
                if (myString == null) {
                    IO.writeLine(myString.length());
                }
            }
            break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
