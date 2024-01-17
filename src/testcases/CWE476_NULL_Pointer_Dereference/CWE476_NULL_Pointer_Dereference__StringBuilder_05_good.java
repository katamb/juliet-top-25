package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__StringBuilder_05_good extends AbstractTestCase {
    private boolean privateTrue = true;
    private boolean privateFalse = false;
    private void goodG2B1() throws Throwable {
        StringBuilder data;
        if (privateFalse) {
            data = null;
        } else {
            data = new StringBuilder();
        }
        if (privateTrue) {
            IO.writeLine("" + data.length());
        }
    }
    private void goodG2B2() throws Throwable {
        StringBuilder data;
        if (privateTrue) {
            data = new StringBuilder();
        } else {
            data = null;
        }
        if (privateTrue) {
            IO.writeLine("" + data.length());
        }
    }
    private void goodB2G1() throws Throwable {
        StringBuilder data;
        if (privateTrue) {
            data = null;
        } else {
            data = null;
        }
        if (privateFalse) {
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
        if (privateTrue) {
            data = null;
        } else {
            data = null;
        }
        if (privateTrue) {
            if (data != null) {
                IO.writeLine("" + data.length());
            } else {
                IO.writeLine("data is null");
            }
        }
    }
    public void good() throws Throwable {
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
