package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__String_31_bad extends AbstractTestCase {
    public void bad() throws Throwable {
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
