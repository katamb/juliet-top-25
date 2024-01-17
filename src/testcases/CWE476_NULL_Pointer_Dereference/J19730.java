package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19730 extends AbstractTestCase {
    public void handle() throws Throwable {
        StringBuilder dataCopy;
        {
            StringBuilder data;
            data = null;
            dataCopy = data;
        }
        {
            StringBuilder data = dataCopy;
            IO.writeLine("" + data.length());
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
