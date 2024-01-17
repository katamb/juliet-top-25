package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__int_array_12_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        int[] data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = null;
        } else {
            data = new int[5];
        }
        if (IO.staticReturnsTrueOrFalse()) {
            IO.writeLine("" + data.length);
        } else {
            if (data != null) {
                IO.writeLine("" + data.length);
            } else {
                IO.writeLine("data is null");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
