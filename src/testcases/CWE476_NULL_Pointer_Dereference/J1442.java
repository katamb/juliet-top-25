package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J1442 extends AbstractTestCase {
    public void handle() throws Throwable {
        StringBuilder data;
        data = null;
        IO.writeLine("" + data.length());
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
