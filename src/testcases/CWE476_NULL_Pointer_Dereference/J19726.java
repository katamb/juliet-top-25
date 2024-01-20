package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19726 extends AbstractTestCase {
    public void handle() throws Throwable {
        StringBuilder data;
        data = null;
        for (int j = 0; j < 1; j++) {
            IO.writeLine("" + data.length());
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
