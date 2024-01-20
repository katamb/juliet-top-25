package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19522 extends AbstractTestCase {
    public void handle() throws Throwable {
        if (IO.staticTrue) {
            {
                String myString = null;
                if ((myString != null) & (myString.length() > 0)) {
                    IO.writeLine("The string length is greater than 0");
                }
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
