package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19611 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void goodG2BSink(Integer data) throws Throwable {
        IO.writeLine("" + data.toString());
    }
    private void processG2B() throws Throwable {
        Integer data;
        data = Integer.valueOf(5);
        goodG2BSink(data);
    }
    private void goodB2GSink(Integer data) throws Throwable {
        if (data != null) {
            IO.writeLine("" + data.toString());
        } else {
            IO.writeLine("data is null");
        }
    }
    private void processB2G() throws Throwable {
        Integer data;
        data = null;
        goodB2GSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
