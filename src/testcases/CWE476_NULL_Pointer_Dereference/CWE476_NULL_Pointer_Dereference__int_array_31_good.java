package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__int_array_31_good extends AbstractTestCase {
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2B() throws Throwable {
        int[] dataCopy;
        {
            int[] data;
            data = new int[5];
            dataCopy = data;
        }
        {
            int[] data = dataCopy;
            IO.writeLine("" + data.length);
        }
    }
    private void goodB2G() throws Throwable {
        int[] dataCopy;
        {
            int[] data;
            data = null;
            dataCopy = data;
        }
        {
            int[] data = dataCopy;
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
