package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__Integer_41 extends AbstractTestCase {
    private void badSink(Integer data) throws Throwable {
        IO.writeLine("" + data.toString());
    }
    public void bad() throws Throwable {
        Integer data;
        data = null;
        badSink(data);
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2BSink(Integer data) throws Throwable {
        IO.writeLine("" + data.toString());
    }
    private void goodG2B() throws Throwable {
        Integer data;
        data = Integer.valueOf(5);
        goodG2BSink(data);
    }
    private void goodB2GSink(Integer data) throws Throwable {
        if (data != null) {
            IO.writeLine("" + data.toString());
        } else {
            IO.writeLine("data is null");
        }
    }
    private void goodB2G() throws Throwable {
        Integer data;
        data = null;
        goodB2GSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}