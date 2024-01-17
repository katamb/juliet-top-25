package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19684 extends AbstractTestCase {
    public void handle() throws Throwable {
        if (IO.STATIC_FINAL_FIVE == 5) {
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
