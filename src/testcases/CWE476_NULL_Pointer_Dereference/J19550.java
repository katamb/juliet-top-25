package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19550 extends AbstractTestCase {
    private int privateFive = 5;
    public void handle() throws Throwable {
        if (privateFive == 5) {
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
