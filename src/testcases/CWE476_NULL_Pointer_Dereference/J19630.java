package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19630 extends AbstractTestCase {
    private boolean privateReturnsTrue() {
        return true;
    }
    private boolean privateReturnsFalse() {
        return false;
    }
    public void handle() throws Throwable {
        int[] data;
        if (privateReturnsTrue()) {
            data = null;
        } else {
            data = null;
        }
        if (privateReturnsTrue()) {
            IO.writeLine("" + data.length);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
