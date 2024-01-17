package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__Integer_08_bad extends AbstractTestCase {
    private boolean privateReturnsTrue() {
        return true;
    }
    private boolean privateReturnsFalse() {
        return false;
    }
    public void bad() throws Throwable {
        Integer data;
        if (privateReturnsTrue()) {
            data = null;
        } else {
            data = null;
        }
        if (privateReturnsTrue()) {
            IO.writeLine("" + data.toString());
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
