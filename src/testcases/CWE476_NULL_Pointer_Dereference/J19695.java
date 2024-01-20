package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19695 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void processG2B() throws Throwable {
        StringBuilder data;
        data = new StringBuilder();
        IO.writeLine("" + data.length());
    }
    private void processB2G() throws Throwable {
        StringBuilder data;
        data = null;
        if (data != null) {
            IO.writeLine("" + data.length());
        } else {
            IO.writeLine("data is null");
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
