package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__int_array_16_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        int[] data;
        while (true) {
            data = null;
            break;
        }
        while (true) {
            IO.writeLine("" + data.length);
            break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
