package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__Integer_16_good extends AbstractTestCase {
    private void goodG2B() throws Throwable {
        Integer data;
        while (true) {
            data = Integer.valueOf(5);
            break;
        }
        while (true) {
            IO.writeLine("" + data.toString());
            break;
        }
    }
    private void goodB2G() throws Throwable {
        Integer data;
        while (true) {
            data = null;
            break;
        }
        while (true) {
            if (data != null) {
                IO.writeLine("" + data.toString());
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
