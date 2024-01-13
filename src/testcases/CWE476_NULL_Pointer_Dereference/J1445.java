package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J1445 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void processG2B() throws Throwable {
        String data;
        data = "This is not null";
        IO.writeLine("" + data.length());
    }
    private void processB2G() throws Throwable {
        String data;
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
