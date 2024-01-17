package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__Integer_45_good extends AbstractTestCase {
    private Integer dataBad;
    private Integer dataGoodG2B;
    private Integer dataGoodB2G;
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2BSink() throws Throwable {
        Integer data = dataGoodG2B;
        IO.writeLine("" + data.toString());
    }
    private void goodG2B() throws Throwable {
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
    private void goodB2G() throws Throwable {
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
