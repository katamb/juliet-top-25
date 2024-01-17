package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__String_04_bad extends AbstractTestCase {
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;
    public void bad() throws Throwable {
        String data;
        if (PRIVATE_STATIC_FINAL_TRUE) {
            data = null;
        } else {
            data = null;
        }
        if (PRIVATE_STATIC_FINAL_TRUE) {
            IO.writeLine("" + data.length());
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
