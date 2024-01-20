package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19568 extends AbstractTestCase {
    public void handle() throws Throwable {
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
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
