package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19754 extends AbstractTestCase {
    public void handle() throws Throwable {
        String data;
        if (IO.STATIC_FINAL_TRUE) {
            data = null;
        } else {
            data = null;
        }
        if (IO.STATIC_FINAL_TRUE) {
            IO.writeLine("" + data.length());
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
