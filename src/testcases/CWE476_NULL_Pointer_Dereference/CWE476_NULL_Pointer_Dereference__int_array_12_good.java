package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__int_array_12_good extends AbstractTestCase {
    private void goodG2B() throws Throwable {
        int[] data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = new int[5];
        } else {
            data = new int[5];
        }
        if (IO.staticReturnsTrueOrFalse()) {
            IO.writeLine("" + data.length);
        } else {
            IO.writeLine("" + data.length);
        }
    }
    private void goodB2G() throws Throwable {
        int[] data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = null;
        } else {
            data = null;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            if (data != null) {
                IO.writeLine("" + data.length);
            } else {
                IO.writeLine("data is null");
            }
        } else {
            if (data != null) {
                IO.writeLine("" + data.length);
            } else {
                IO.writeLine("data is null");
            }
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
