package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__int_array_16_good extends AbstractTestCase {
    private void goodG2B() throws Throwable {
        int[] data;
        while (true) {
            data = new int[5];
            break;
        }
        while (true) {
            IO.writeLine("" + data.length);
            break;
        }
    }
    private void goodB2G() throws Throwable {
        int[] data;
        while (true) {
            data = null;
            break;
        }
        while (true) {
            if (data != null) {
                IO.writeLine("" + data.length);
            } else {
                IO.writeLine("data is null");
            }
            break;
        }
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
