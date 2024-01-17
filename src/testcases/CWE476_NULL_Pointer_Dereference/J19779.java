package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19779 extends AbstractTestCase {
    private String badSource() throws Throwable {
        String data;
        data = null;
        return data;
    }
    private String processG2BSource() throws Throwable {
        String data;
        data = "This is not null";
        return data;
    }
    private void processG2B() throws Throwable {
        String data = processG2BSource();
        IO.writeLine("" + data.length());
    }
    private String processB2GSource() throws Throwable {
        String data;
        data = null;
        return data;
    }
    private void processB2G() throws Throwable {
        String data = processB2GSource();
        if (data != null) {
            IO.writeLine("" + data.length());
        } else {
            IO.writeLine("data is null");
        }
    }
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
