package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19666 extends AbstractTestCase {
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;
    public void handle() throws Throwable {
        if (PRIVATE_STATIC_FINAL_TRUE) {
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
