package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__Integer_09_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        Integer data;
        if (IO.STATIC_FINAL_TRUE) {
            data = null;
        } else {
            data = null;
        }
        if (IO.STATIC_FINAL_TRUE) {
            IO.writeLine("" + data.toString());
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
