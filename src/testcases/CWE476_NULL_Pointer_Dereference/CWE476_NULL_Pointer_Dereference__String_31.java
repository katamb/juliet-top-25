package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__String_31 extends AbstractTestCase {
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
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2B() throws Throwable {
        String dataCopy;
        {
            String data;
            data = "This is not null";
            dataCopy = data;
        }
        {
            String data = dataCopy;
            IO.writeLine("" + data.length());
        }
    }
    private void goodB2G() throws Throwable {
        String dataCopy;
        {
            String data;
            data = null;
            dataCopy = data;
        }
        {
            String data = dataCopy;
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