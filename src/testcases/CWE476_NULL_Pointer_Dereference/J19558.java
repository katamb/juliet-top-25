package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19558 extends AbstractTestCase {
    public void handle() throws Throwable {
        if (IO.staticReturnsTrue()) {
            {
                String myString = null;
                if (myString == null) {
                    IO.writeLine(myString.length());
                }
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
