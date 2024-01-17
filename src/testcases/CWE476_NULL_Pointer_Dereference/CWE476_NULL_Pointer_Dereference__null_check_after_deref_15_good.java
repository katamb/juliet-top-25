package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__null_check_after_deref_15_good extends AbstractTestCase {
    private void good1() throws Throwable {
        switch (8) {
            case 7:
                IO.writeLine("Benign, fixed string");
                break;
            default: {
                String myString = null;
                myString = "Hello";
                IO.writeLine(myString.length());
                myString = "my, how I've changed";
                IO.writeLine(myString.length());
            }
            break;
        }
    }
    private void good2() throws Throwable {
        switch (7) {
            case 7: {
                String myString = null;
                myString = "Hello";
                IO.writeLine(myString.length());
                myString = "my, how I've changed";
                IO.writeLine(myString.length());
            }
            break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    public void good() throws Throwable {
        good1();
        good2();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
