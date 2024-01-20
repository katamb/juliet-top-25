package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19759 extends AbstractTestCase {
    private void processG2B1() throws Throwable {
        String data;
        if (IO.staticReturnsFalse()) {
            data = null;
        } else {
            data = "This is not null";
        }
        if (IO.staticReturnsTrue()) {
            IO.writeLine("" + data.length());
        }
    }
    private void processG2B2() throws Throwable {
        String data;
        if (IO.staticReturnsTrue()) {
            data = "This is not null";
        } else {
            data = null;
        }
        if (IO.staticReturnsTrue()) {
            IO.writeLine("" + data.length());
        }
    }
    private void processB2G1() throws Throwable {
        String data;
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
    private void processB2G2() throws Throwable {
        String data;
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
        processG2B1();
        processG2B2();
        processB2G1();
        processB2G2();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
