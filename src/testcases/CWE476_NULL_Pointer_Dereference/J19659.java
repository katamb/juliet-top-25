package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19659 extends AbstractTestCase {
    private int[] dataBad;
    private int[] dataGoodG2B;
    private int[] dataGoodB2G;
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void goodG2BSink() throws Throwable {
        int[] data = dataGoodG2B;
        IO.writeLine("" + data.length);
    }
    private void processG2B() throws Throwable {
        int[] data;
        data = new int[5];
        dataGoodG2B = data;
        goodG2BSink();
    }
    private void goodB2GSink() throws Throwable {
        int[] data = dataGoodB2G;
        if (data != null) {
            IO.writeLine("" + data.length);
        } else {
            IO.writeLine("data is null");
        }
    }
    private void processB2G() throws Throwable {
        int[] data;
        data = null;
        dataGoodB2G = data;
        goodB2GSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
