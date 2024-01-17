package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19733 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void gG2BS(StringBuilder data) throws Throwable {
        IO.writeLine("" + data.length());
    }
    private void processG2B() throws Throwable {
        StringBuilder data;
        data = new StringBuilder();
        gG2BS(data);
    }
    private void gB2GS(StringBuilder data) throws Throwable {
        if (data != null) {
            IO.writeLine("" + data.length());
        } else {
            IO.writeLine("data is null");
        }
    }
    private void processB2G() throws Throwable {
        StringBuilder data;
        data = null;
        gB2GS(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
