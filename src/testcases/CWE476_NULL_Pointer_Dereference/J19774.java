package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19774 extends AbstractTestCase {
    public void handle() throws Throwable {
        String dataCopy;
        {
            String data;
            data = null;
            dataCopy = data;
        }
        {
            String data = dataCopy;
            IO.writeLine("" + data.length());
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
