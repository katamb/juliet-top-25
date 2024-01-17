package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19659 extends AbstractTestCase {
    private int[] dataB;
    private int[] dataGdG2B;
    private int[] dataGdB2G;
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void gG2BSink() throws Throwable {
        int[] data = dataGdG2B;
        IO.writeLine("" + data.length);
    }
    private void processG2B() throws Throwable {
        int[] data;
        data = new int[5];
        dataGdG2B = data;
        gG2BSink();
    }
    private void gB2GSink() throws Throwable {
        int[] data = dataGdB2G;
        if (data != null) {
            IO.writeLine("" + data.length);
        } else {
            IO.writeLine("data is null");
        }
    }
    private void processB2G() throws Throwable {
        int[] data;
        data = null;
        dataGdB2G = data;
        gB2GSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
