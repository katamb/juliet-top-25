package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19688 extends AbstractTestCase {
    public void handle() throws Throwable {
        switch (7) {
            case 7: {
                String myString = null;
                myString = "Hello";
                IO.writeLine(myString.length());
                if (myString != null) {
                    myString = "my, how I've changed";
                }
                IO.writeLine(myString.length());
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
