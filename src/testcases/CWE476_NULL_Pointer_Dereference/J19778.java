package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19778 extends AbstractTestCase {
    private String bSce() throws Throwable {
        String data;
        data = null;
        return data;
    }
    public void handle() throws Throwable {
        String data = bSce();
        IO.writeLine("" + data.length());
    }
    private String processG2BSce() throws Throwable {
        String data;
        data = "This is not null";
        return data;
    }
    private String processB2GSce() throws Throwable {
        String data;
        data = null;
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
