package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__StringBuilder_01_good extends AbstractTestCase {
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2B() throws Throwable {
        StringBuilder data;
        data = new StringBuilder();
        IO.writeLine("" + data.length());
    }
    private void goodB2G() throws Throwable {
        StringBuilder data;
        data = null;
        if (data != null) {
            IO.writeLine("" + data.length());
        } else {
            IO.writeLine("data is null");
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
