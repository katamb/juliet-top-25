package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19642 extends AbstractTestCase {
    public void handle() throws Throwable {
        int[] data;
        if (IO.staticFive == 5) {
            data = null;
        } else {
            data = null;
        }
        if (IO.staticFive == 5) {
            IO.writeLine("" + data.length);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
