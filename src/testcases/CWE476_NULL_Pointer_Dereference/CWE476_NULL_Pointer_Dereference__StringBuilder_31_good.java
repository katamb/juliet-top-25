package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__StringBuilder_31_good extends AbstractTestCase {
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2B() throws Throwable {
        StringBuilder dataCopy;
        {
            StringBuilder data;
            data = new StringBuilder();
            dataCopy = data;
        }
        {
            StringBuilder data = dataCopy;
            IO.writeLine("" + data.length());
        }
    }
    private void goodB2G() throws Throwable {
        StringBuilder dataCopy;
        {
            StringBuilder data;
            data = null;
            dataCopy = data;
        }
        {
            StringBuilder data = dataCopy;
            if (data != null) {
                IO.writeLine("" + data.length());
            } else {
                IO.writeLine("data is null");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
