package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19556 extends AbstractTestCase {
    public void handle() throws Throwable {
        if (IO.staticTrue) {
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
