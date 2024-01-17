package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19733 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void goodG2BSink(StringBuilder data) throws Throwable {
        IO.writeLine("" + data.length());
    }
    private void processG2B() throws Throwable {
        StringBuilder data;
        data = new StringBuilder();
        goodG2BSink(data);
    }
    private void goodB2GSink(StringBuilder data) throws Throwable {
        if (data != null) {
            IO.writeLine("" + data.length());
        } else {
            IO.writeLine("data is null");
        }
    }
    private void processB2G() throws Throwable {
        StringBuilder data;
        data = null;
        goodB2GSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
