package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__StringBuilder_45 extends AbstractTestCase {
    private StringBuilder dataBad;
    private StringBuilder dataGoodG2B;
    private StringBuilder dataGoodB2G;
    private void badSink() throws Throwable {
        StringBuilder data = dataBad;
        IO.writeLine("" + data.length());
    }
    public void bad() throws Throwable {
        StringBuilder data;
        data = null;
        dataBad = data;
        badSink();
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2BSink() throws Throwable {
        StringBuilder data = dataGoodG2B;
        IO.writeLine("" + data.length());
    }
    private void goodG2B() throws Throwable {
        StringBuilder data;
        data = new StringBuilder();
        dataGoodG2B = data;
        goodG2BSink();
    }
    private void goodB2GSink() throws Throwable {
        StringBuilder data = dataGoodB2G;
        if (data != null) {
            IO.writeLine("" + data.length());
        } else {
            IO.writeLine("data is null");
        }
    }
    private void goodB2G() throws Throwable {
        StringBuilder data;
        data = null;
        dataGoodB2G = data;
        goodB2GSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}