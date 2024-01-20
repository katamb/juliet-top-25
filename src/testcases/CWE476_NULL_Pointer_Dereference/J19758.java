package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19758 extends AbstractTestCase {
    public void handle() throws Throwable {
        String data;
        if (IO.staticReturnsTrue()) {
            data = null;
        } else {
            data = null;
        }
        if (IO.staticReturnsTrue()) {
            IO.writeLine("" + data.length());
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
