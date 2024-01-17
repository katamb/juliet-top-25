package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19654 extends AbstractTestCase {
    private void bS(int[] data) throws Throwable {
        IO.writeLine("" + data.length);
    }
    public void handle() throws Throwable {
        int[] data;
        data = null;
        bS(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
