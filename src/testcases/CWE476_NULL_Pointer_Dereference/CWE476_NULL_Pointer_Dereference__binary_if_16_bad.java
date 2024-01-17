package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__binary_if_16_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        while (true) {
            {
                String myString = null;
                if ((myString != null) & (myString.length() > 0)) {
                    IO.writeLine("The string length is greater than 0");
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
