package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19715 extends AbstractTestCase {
    private void goodG2B1() throws Throwable {
        StringBuilder data;
        if (IO.staticReturnsFalse()) {
            data = null;
        } else {
            data = new StringBuilder();
        }
        if (IO.staticReturnsTrue()) {
            IO.writeLine("" + data.length());
        }
    }
    private void goodG2B2() throws Throwable {
        StringBuilder data;
        if (IO.staticReturnsTrue()) {
            data = new StringBuilder();
        } else {
            data = null;
        }
        if (IO.staticReturnsTrue()) {
            IO.writeLine("" + data.length());
        }
    }
    private void goodB2G1() throws Throwable {
        StringBuilder data;
        if (IO.staticReturnsTrue()) {
            data = null;
        } else {
            data = null;
        }
        if (IO.staticReturnsFalse()) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data != null) {
                IO.writeLine("" + data.length());
            } else {
                IO.writeLine("data is null");
            }
        }
    }
    private void goodB2G2() throws Throwable {
        StringBuilder data;
        if (IO.staticReturnsTrue()) {
            data = null;
        } else {
            data = null;
        }
        if (IO.staticReturnsTrue()) {
            if (data != null) {
                IO.writeLine("" + data.length());
            } else {
                IO.writeLine("data is null");
            }
        }
    }
    public void process() throws Throwable {
        goodG2B1();
        goodG2B2();
        goodB2G1();
        goodB2G2();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
