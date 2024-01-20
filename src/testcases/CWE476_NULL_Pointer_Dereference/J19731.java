package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19731 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void processG2B() throws Throwable {
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
    private void processB2G() throws Throwable {
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
