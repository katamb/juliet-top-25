package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19779 extends AbstractTestCase {
    private String badSource() throws Throwable {
        String data;
        data = null;
        return data;
    }
    private String goodG2BSource() throws Throwable {
        String data;
        data = "This is not null";
        return data;
    }
    private void processG2B() throws Throwable {
        String data = goodG2BSource();
        IO.writeLine("" + data.length());
    }
    private String goodB2GSource() throws Throwable {
        String data;
        data = null;
        return data;
    }
    private void processB2G() throws Throwable {
        String data = goodB2GSource();
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
