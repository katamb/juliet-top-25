package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19532 extends AbstractTestCase {
    public void handle() throws Throwable {
        switch (7) {
            case 7: {
                String myString = null;
                if ((myString != null) & (myString.length() > 0)) {
                    IO.writeLine("The string length is greater than 0");
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
