package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__int_array_42_bad extends AbstractTestCase {
    private int[] badSource() throws Throwable {
        int[] data;
        data = null;
        return data;
    }
    public void bad() throws Throwable {
        int[] data = badSource();
        IO.writeLine("" + data.length);
    }
    private int[] goodG2BSource() throws Throwable {
        int[] data;
        data = new int[5];
        return data;
    }
    private int[] goodB2GSource() throws Throwable {
        int[] data;
        data = null;
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
