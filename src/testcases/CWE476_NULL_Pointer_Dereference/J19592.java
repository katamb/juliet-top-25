package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19592 extends AbstractTestCase {
    public void handle() throws Throwable {
        Integer data;
        if (IO.staticReturnsTrue()) {
            data = null;
        } else {
            data = null;
        }
        if (IO.staticReturnsTrue()) {
            IO.writeLine("" + data.toString());
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
