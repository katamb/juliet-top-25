package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__String_42_good extends AbstractTestCase {
    private String badSource() throws Throwable {
        String data;
        data = null;
        return data;
    }
    private String goodG2BSource() throws Throwable {
        String data;
        data = "This is not null";
        return data;
    }
    private void goodG2B() throws Throwable {
        String data = goodG2BSource();
        IO.writeLine("" + data.length());
    }
    private String goodB2GSource() throws Throwable {
        String data;
        data = null;
        return data;
    }
    private void goodB2G() throws Throwable {
        String data = goodB2GSource();
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
