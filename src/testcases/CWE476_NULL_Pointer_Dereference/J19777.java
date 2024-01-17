package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19777 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void goodG2BSink(String data) throws Throwable {
        IO.writeLine("" + data.length());
    }
    private void processG2B() throws Throwable {
        String data;
        data = "This is not null";
        goodG2BSink(data);
    }
    private void goodB2GSink(String data) throws Throwable {
        if (data != null) {
            IO.writeLine("" + data.length());
        } else {
            IO.writeLine("data is null");
        }
    }
    private void processB2G() throws Throwable {
        String data;
        data = null;
        goodB2GSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
