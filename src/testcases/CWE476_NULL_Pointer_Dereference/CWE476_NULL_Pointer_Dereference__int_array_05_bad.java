package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__int_array_05_bad extends AbstractTestCase {
    private boolean privateTrue = true;
    private boolean privateFalse = false;
    public void bad() throws Throwable {
        int[] data;
        if (privateTrue) {
            data = null;
        } else {
            data = null;
        }
        if (privateTrue) {
            IO.writeLine("" + data.length);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
