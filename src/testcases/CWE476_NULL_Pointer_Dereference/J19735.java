package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19735 extends AbstractTestCase {
    private StringBuilder badSource() throws Throwable {
        StringBuilder data;
        data = null;
        return data;
    }
    private StringBuilder goodG2BSource() throws Throwable {
        StringBuilder data;
        data = new StringBuilder();
        return data;
    }
    private void processG2B() throws Throwable {
        StringBuilder data = goodG2BSource();
        IO.writeLine("" + data.length());
    }
    private StringBuilder goodB2GSource() throws Throwable {
        StringBuilder data;
        data = null;
        return data;
    }
    private void processB2G() throws Throwable {
        StringBuilder data = goodB2GSource();
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
