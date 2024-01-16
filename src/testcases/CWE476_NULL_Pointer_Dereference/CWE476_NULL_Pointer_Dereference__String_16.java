package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__String_16 extends AbstractTestCase {
    public void bad() throws Throwable {
        String data;
        while (true) {
            data = null;
            break;
        }
        while (true) {
            IO.writeLine("" + data.length());
            break;
        }
    }
    private void goodG2B() throws Throwable {
        String data;
        while (true) {
            data = "This is not null";
            break;
        }
        while (true) {
            IO.writeLine("" + data.length());
            break;
        }
    }
    private void goodB2G() throws Throwable {
        String data;
        while (true) {
            data = null;
            break;
        }
        while (true) {
            if (data != null) {
                IO.writeLine("" + data.length());
            } else {
                IO.writeLine("data is null");
            }
            break;
        }
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}