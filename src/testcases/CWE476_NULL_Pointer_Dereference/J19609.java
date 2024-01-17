package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19609 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void processG2B() throws Throwable {
        Integer dataCopy;
        {
            Integer data;
            data = Integer.valueOf(5);
            dataCopy = data;
        }
        {
            Integer data = dataCopy;
            IO.writeLine("" + data.toString());
        }
    }
    private void processB2G() throws Throwable {
        Integer dataCopy;
        {
            Integer data;
            data = null;
            dataCopy = data;
        }
        {
            Integer data = dataCopy;
            if (data != null) {
                IO.writeLine("" + data.toString());
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
