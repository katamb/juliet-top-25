package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19646 extends AbstractTestCase {
    public void handle() throws Throwable {
        int[] data;
        while (true) {
            data = null;
            break;
        }
        while (true) {
            IO.writeLine("" + data.length);
            break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
