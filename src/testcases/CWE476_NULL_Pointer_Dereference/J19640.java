package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19640 extends AbstractTestCase {
    public void handle() throws Throwable {
        int[] data;
        if (IO.STATIC_FINAL_FIVE == 5) {
            data = null;
        } else {
            data = null;
        }
        if (IO.STATIC_FINAL_FIVE == 5) {
            IO.writeLine("" + data.length);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
