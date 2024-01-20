package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19725 extends AbstractTestCase {
    private void processG2B() throws Throwable {
        StringBuilder data;
        while (true) {
            data = new StringBuilder();
            break;
        }
        while (true) {
            IO.writeLine("" + data.length());
            break;
        }
    }
    private void processB2G() throws Throwable {
        StringBuilder data;
        while (true) {
            data = null;
            break;
        }
        while (true) {
            if (data != null) {
                IO.writeLine("" + data.length());
            } else {
                IO.writeLine("data is null");
            }
            break;
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
