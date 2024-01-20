package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19779 extends AbstractTestCase {
    private String bSce() throws Throwable {
        String data;
        data = null;
        return data;
    }
    private String processG2BSce() throws Throwable {
        String data;
        data = "This is not null";
        return data;
    }
    private void processG2B() throws Throwable {
        String data = processG2BSce();
        IO.writeLine("" + data.length());
    }
    private String processB2GSce() throws Throwable {
        String data;
        data = null;
        return data;
    }
    private void processB2G() throws Throwable {
        String data = processB2GSce();
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
