package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19644 extends AbstractTestCase {
    public void handle() throws Throwable {
        int[] data;
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
                IO.writeLine("" + data.length);
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
