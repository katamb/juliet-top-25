package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J1436 extends AbstractTestCase {
    public void handle() throws Throwable {
        Integer data;
        data = null;
        IO.writeLine("" + data.toString());
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
