package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19603 extends AbstractTestCase {
    private void processG2B() throws Throwable {
        Integer data;
        while (true) {
            data = Integer.valueOf(5);
            break;
        }
        while (true) {
            IO.writeLine("" + data.toString());
            break;
        }
    }
    private void processB2G() throws Throwable {
        Integer data;
        while (true) {
            data = null;
            break;
        }
        while (true) {
            if (data != null) {
                IO.writeLine("" + data.toString());
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
