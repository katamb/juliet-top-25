package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__int_array_45 extends AbstractTestCase {
    private int[] dataBad;
    private int[] dataGoodG2B;
    private int[] dataGoodB2G;
    private void badSink() throws Throwable {
        int[] data = dataBad;
        IO.writeLine("" + data.length);
    }
    public void bad() throws Throwable {
        int[] data;
        data = null;
        dataBad = data;
        badSink();
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2BSink() throws Throwable {
        int[] data = dataGoodG2B;
        IO.writeLine("" + data.length);
    }
    private void goodG2B() throws Throwable {
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
    private void goodB2G() throws Throwable {
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