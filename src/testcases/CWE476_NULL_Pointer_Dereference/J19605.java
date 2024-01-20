package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19605 extends AbstractTestCase {
    private void processG2B() throws Throwable {
        Integer data;
        data = Integer.valueOf(5);
        for (int j = 0; j < 1; j++) {
            IO.writeLine("" + data.toString());
        }
    }
    private void processB2G() throws Throwable {
        Integer data;
        data = null;
        for (int k = 0; k < 1; k++) {
            if (data != null) {
                IO.writeLine("" + data.toString());
            } else {
                IO.writeLine("data is null");
            }
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
