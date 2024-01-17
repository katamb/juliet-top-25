package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__int_array_42_good extends AbstractTestCase {
    private int[] badSource() throws Throwable {
        int[] data;
        data = null;
        return data;
    }
    private int[] goodG2BSource() throws Throwable {
        int[] data;
        data = new int[5];
        return data;
    }
    private void goodG2B() throws Throwable {
        int[] data = goodG2BSource();
        IO.writeLine("" + data.length);
    }
    private int[] goodB2GSource() throws Throwable {
        int[] data;
        data = null;
        return data;
    }
    private void goodB2G() throws Throwable {
        int[] data = goodB2GSource();
        if (data != null) {
            IO.writeLine("" + data.length);
        } else {
            IO.writeLine("data is null");
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
