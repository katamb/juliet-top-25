package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19620 extends AbstractTestCase {
    public void handle() throws Throwable {
        int[] data;
        if (5 == 5) {
            data = null;
        } else {
            data = null;
        }
        if (5 == 5) {
            IO.writeLine("" + data.length);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
