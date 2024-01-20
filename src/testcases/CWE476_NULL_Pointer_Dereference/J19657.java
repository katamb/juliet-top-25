package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19657 extends AbstractTestCase {
    private int[] bSce() throws Throwable {
        int[] data;
        data = null;
        return data;
    }
    private int[] processG2BSce() throws Throwable {
        int[] data;
        data = new int[5];
        return data;
    }
    private void processG2B() throws Throwable {
        int[] data = processG2BSce();
        IO.writeLine("" + data.length);
    }
    private int[] processB2GSce() throws Throwable {
        int[] data;
        data = null;
        return data;
    }
    private void processB2G() throws Throwable {
        int[] data = processB2GSce();
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
