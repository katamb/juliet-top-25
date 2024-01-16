package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__Integer_31 extends AbstractTestCase {
    public void bad() throws Throwable {
        Integer dataCopy;
        {
            Integer data;
            data = null;
            dataCopy = data;
        }
        {
            Integer data = dataCopy;
            IO.writeLine("" + data.toString());
        }
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2B() throws Throwable {
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
    private void goodB2G() throws Throwable {
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