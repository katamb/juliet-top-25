package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19657 extends AbstractTestCase {
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
    private void processG2B() throws Throwable {
        int[] data = goodG2BSource();
        IO.writeLine("" + data.length);
    }
    private int[] goodB2GSource() throws Throwable {
        int[] data;
        data = null;
        return data;
    }
    private void processB2G() throws Throwable {
        int[] data = goodB2GSource();
        if (data != null) {
            IO.writeLine("" + data.length);
        } else {
            IO.writeLine("data is null");
        }
    }
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
