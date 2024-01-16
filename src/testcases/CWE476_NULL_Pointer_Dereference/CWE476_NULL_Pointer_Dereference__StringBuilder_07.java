package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__StringBuilder_07 extends AbstractTestCase {
    private int privateFive = 5;
    public void bad() throws Throwable {
        StringBuilder data;
        if (privateFive == 5) {
            data = null;
        } else {
            data = null;
        }
        if (privateFive == 5) {
            IO.writeLine("" + data.length());
        }
    }
    private void goodG2B1() throws Throwable {
        StringBuilder data;
        if (privateFive != 5) {
            data = null;
        } else {
            data = new StringBuilder();
        }
        if (privateFive == 5) {
            IO.writeLine("" + data.length());
        }
    }
    private void goodG2B2() throws Throwable {
        StringBuilder data;
        if (privateFive == 5) {
            data = new StringBuilder();
        } else {
            data = null;
        }
        if (privateFive == 5) {
            IO.writeLine("" + data.length());
        }
    }
    private void goodB2G1() throws Throwable {
        StringBuilder data;
        if (privateFive == 5) {
            data = null;
        } else {
            data = null;
        }
        if (privateFive != 5) {
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
        if (privateFive == 5) {
            data = null;
        } else {
            data = null;
        }
        if (privateFive == 5) {
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