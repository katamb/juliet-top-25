package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19590 extends AbstractTestCase {
    public void handle() throws Throwable {
        Integer data;
        if (IO.staticTrue) {
            data = null;
        } else {
            data = null;
        }
        if (IO.staticTrue) {
            IO.writeLine("" + data.toString());
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
