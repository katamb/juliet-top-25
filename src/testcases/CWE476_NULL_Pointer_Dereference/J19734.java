package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19734 extends AbstractTestCase {
    private StringBuilder bSce() throws Throwable {
        StringBuilder data;
        data = null;
        return data;
    }
    public void handle() throws Throwable {
        StringBuilder data = bSce();
        IO.writeLine("" + data.length());
    }
    private StringBuilder processG2BSce() throws Throwable {
        StringBuilder data;
        data = new StringBuilder();
        return data;
    }
    private StringBuilder processB2GSce() throws Throwable {
        StringBuilder data;
        data = null;
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
