package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19735 extends AbstractTestCase {
    private StringBuilder bSce() throws Throwable {
        StringBuilder data;
        data = null;
        return data;
    }
    private StringBuilder processG2BSce() throws Throwable {
        StringBuilder data;
        data = new StringBuilder();
        return data;
    }
    private void processG2B() throws Throwable {
        StringBuilder data = processG2BSce();
        IO.writeLine("" + data.length());
    }
    private StringBuilder processB2GSce() throws Throwable {
        StringBuilder data;
        data = null;
        return data;
    }
    private void processB2G() throws Throwable {
        StringBuilder data = processB2GSce();
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
