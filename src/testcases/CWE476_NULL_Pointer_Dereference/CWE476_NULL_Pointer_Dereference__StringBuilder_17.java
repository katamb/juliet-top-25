package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__StringBuilder_17 extends AbstractTestCase {
    public void bad() throws Throwable {
        StringBuilder data;
        data = null;
        for (int j = 0; j < 1; j++) {
            IO.writeLine("" + data.length());
        }
    }
    private void goodG2B() throws Throwable {
        StringBuilder data;
        data = new StringBuilder();
        for (int j = 0; j < 1; j++) {
            IO.writeLine("" + data.length());
        }
    }
    private void goodB2G() throws Throwable {
        StringBuilder data;
        data = null;
        for (int k = 0; k < 1; k++) {
            if (data != null) {
                IO.writeLine("" + data.length());
            } else {
                IO.writeLine("data is null");
            }
        }
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}