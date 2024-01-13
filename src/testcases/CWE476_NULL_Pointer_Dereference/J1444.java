package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J1444 extends AbstractTestCase {
    public void handle() throws Throwable {
        String data;
        data = null;
        IO.writeLine("" + data.length());
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
