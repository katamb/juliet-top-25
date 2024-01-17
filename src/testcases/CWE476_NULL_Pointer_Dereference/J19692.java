package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19692 extends AbstractTestCase {
    public void handle() throws Throwable {
        for (int j = 0; j < 1; j++) {
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
