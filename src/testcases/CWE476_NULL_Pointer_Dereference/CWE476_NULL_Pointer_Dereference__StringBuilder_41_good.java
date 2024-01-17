package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__StringBuilder_41_good extends AbstractTestCase {
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2BSink(StringBuilder data) throws Throwable {
        IO.writeLine("" + data.length());
    }
    private void goodG2B() throws Throwable {
        StringBuilder data;
        data = new StringBuilder();
        goodG2BSink(data);
    }
    private void goodB2GSink(StringBuilder data) throws Throwable {
        if (data != null) {
            IO.writeLine("" + data.length());
        } else {
            IO.writeLine("data is null");
        }
    }
    private void goodB2G() throws Throwable {
        StringBuilder data;
        data = null;
        goodB2GSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
