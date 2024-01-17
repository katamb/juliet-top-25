package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__String_42_bad extends AbstractTestCase {
    private String badSource() throws Throwable {
        String data;
        data = null;
        return data;
    }
    public void bad() throws Throwable {
        String data = badSource();
        IO.writeLine("" + data.length());
    }
    private String goodG2BSource() throws Throwable {
        String data;
        data = "This is not null";
        return data;
    }
    private String goodB2GSource() throws Throwable {
        String data;
        data = null;
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
