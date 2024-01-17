package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__StringBuilder_42_good extends AbstractTestCase {
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
    private void goodG2B() throws Throwable {
        StringBuilder data = goodG2BSource();
        IO.writeLine("" + data.length());
    }
    private StringBuilder goodB2GSource() throws Throwable {
        StringBuilder data;
        data = null;
        return data;
    }
    private void goodB2G() throws Throwable {
        StringBuilder data = goodB2GSource();
        if (data != null) {
            IO.writeLine("" + data.length());
        } else {
            IO.writeLine("data is null");
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
