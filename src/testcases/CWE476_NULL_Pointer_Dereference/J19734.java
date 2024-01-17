package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19734 extends AbstractTestCase {
    private StringBuilder badSource() throws Throwable {
        StringBuilder data;
        data = null;
        return data;
    }
    public void handle() throws Throwable {
        StringBuilder data = badSource();
        IO.writeLine("" + data.length());
    }
    private StringBuilder goodG2BSource() throws Throwable {
        StringBuilder data;
        data = new StringBuilder();
        return data;
    }
    private StringBuilder goodB2GSource() throws Throwable {
        StringBuilder data;
        data = null;
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
