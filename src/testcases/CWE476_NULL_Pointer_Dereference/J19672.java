package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19672 extends AbstractTestCase {
    private int privateFive = 5;
    public void handle() throws Throwable {
        if (privateFive == 5) {
            {
                String myString = null;
                myString = "Hello";
                IO.writeLine(myString.length());
                if (myString != null) {
                    myString = "my, how I've changed";
                }
                IO.writeLine(myString.length());
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
