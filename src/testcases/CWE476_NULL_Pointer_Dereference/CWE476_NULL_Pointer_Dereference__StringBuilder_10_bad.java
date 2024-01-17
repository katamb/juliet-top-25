package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__StringBuilder_10_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        StringBuilder data;
        if (IO.staticTrue) {
            data = null;
        } else {
            data = null;
        }
        if (IO.staticTrue) {
            IO.writeLine("" + data.length());
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
