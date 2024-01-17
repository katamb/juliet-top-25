package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__StringBuilder_02_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        StringBuilder data;
        if (true) {
            data = null;
        } else {
            data = null;
        }
        if (true) {
            IO.writeLine("" + data.length());
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
