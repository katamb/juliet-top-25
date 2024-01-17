package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19615 extends AbstractTestCase {
    private Integer dataBad;
    private Integer dataGoodG2B;
    private Integer dataGoodB2G;
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void goodG2BSink() throws Throwable {
        Integer data = dataGoodG2B;
        IO.writeLine("" + data.toString());
    }
    private void processG2B() throws Throwable {
        Integer data;
        data = Integer.valueOf(5);
        dataGoodG2B = data;
        goodG2BSink();
    }
    private void goodB2GSink() throws Throwable {
        Integer data = dataGoodB2G;
        if (data != null) {
            IO.writeLine("" + data.toString());
        } else {
            IO.writeLine("data is null");
        }
    }
    private void processB2G() throws Throwable {
        Integer data;
        data = null;
        dataGoodB2G = data;
        goodB2GSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
