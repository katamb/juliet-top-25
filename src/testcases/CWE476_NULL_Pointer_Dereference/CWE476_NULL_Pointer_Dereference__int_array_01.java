package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__int_array_01 extends AbstractTestCase {
    public void bad() throws Throwable {
        int[] data;
        data = null;
        IO.writeLine("" + data.length);
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2B() throws Throwable {
        int[] data;
        data = new int[5];
        IO.writeLine("" + data.length);
    }
    private void goodB2G() throws Throwable {
        int[] data;
        data = null;
        if (data != null) {
            IO.writeLine("" + data.length);
        } else {
            IO.writeLine("data is null");
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}