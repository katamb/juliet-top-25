package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__StringBuilder_12 extends AbstractTestCase {
    public void bad() throws Throwable {
        StringBuilder data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = null;
        } else {
            data = new StringBuilder();
        }
        if (IO.staticReturnsTrueOrFalse()) {
            IO.writeLine("" + data.length());
        } else {
            if (data != null) {
                IO.writeLine("" + data.length());
            } else {
                IO.writeLine("data is null");
            }
        }
    }
    private void goodG2B() throws Throwable {
        StringBuilder data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = new StringBuilder();
        } else {
            data = new StringBuilder();
        }
        if (IO.staticReturnsTrueOrFalse()) {
            IO.writeLine("" + data.length());
        } else {
            IO.writeLine("" + data.length());
        }
    }
    private void goodB2G() throws Throwable {
        StringBuilder data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = null;
        } else {
            data = null;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            if (data != null) {
                IO.writeLine("" + data.length());
            } else {
                IO.writeLine("data is null");
            }
        } else {
            if (data != null) {
                IO.writeLine("" + data.length());
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