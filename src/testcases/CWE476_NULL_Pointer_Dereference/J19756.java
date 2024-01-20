package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19756 extends AbstractTestCase {
    public void handle() throws Throwable {
        String data;
        if (IO.staticTrue) {
            data = null;
        } else {
            data = null;
        }
        if (IO.staticTrue) {
            IO.writeLine("" + data.length());
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
