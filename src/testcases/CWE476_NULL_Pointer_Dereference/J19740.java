package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19740 extends AbstractTestCase {
    public void handle() throws Throwable {
        String data;
        if (true) {
            data = null;
        } else {
            data = null;
        }
        if (true) {
            IO.writeLine("" + data.length());
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
