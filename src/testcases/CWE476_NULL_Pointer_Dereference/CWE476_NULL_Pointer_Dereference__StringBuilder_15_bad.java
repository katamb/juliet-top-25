package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__StringBuilder_15_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        StringBuilder data;
        switch (6) {
            case 6:
                data = null;
                break;
            default:
                data = null;
                break;
        }
        switch (7) {
            case 7:
                IO.writeLine("" + data.length());
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
