package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19711 extends AbstractTestCase {
    private void processG2B1() throws Throwable {
        StringBuilder data;
        if (IO.STATIC_FINAL_FALSE) {
            data = null;
        } else {
            data = new StringBuilder();
        }
        if (IO.STATIC_FINAL_TRUE) {
            IO.writeLine("" + data.length());
        }
    }
    private void processG2B2() throws Throwable {
        StringBuilder data;
        if (IO.STATIC_FINAL_TRUE) {
            data = new StringBuilder();
        } else {
            data = null;
        }
        if (IO.STATIC_FINAL_TRUE) {
            IO.writeLine("" + data.length());
        }
    }
    private void processB2G1() throws Throwable {
        StringBuilder data;
        if (IO.STATIC_FINAL_TRUE) {
            data = null;
        } else {
            data = null;
        }
        if (IO.STATIC_FINAL_FALSE) {
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
        StringBuilder data;
        if (IO.STATIC_FINAL_TRUE) {
            data = null;
        } else {
            data = null;
        }
        if (IO.STATIC_FINAL_TRUE) {
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
