package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__String_45_good extends AbstractTestCase {
    private String dataBad;
    private String dataGoodG2B;
    private String dataGoodB2G;
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2BSink() throws Throwable {
        String data = dataGoodG2B;
        IO.writeLine("" + data.length());
    }
    private void goodG2B() throws Throwable {
        String data;
        data = "This is not null";
        dataGoodG2B = data;
        goodG2BSink();
    }
    private void goodB2GSink() throws Throwable {
        String data = dataGoodB2G;
        if (data != null) {
            IO.writeLine("" + data.length());
        } else {
            IO.writeLine("data is null");
        }
    }
    private void goodB2G() throws Throwable {
        String data;
        data = null;
        dataGoodB2G = data;
        goodB2GSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
