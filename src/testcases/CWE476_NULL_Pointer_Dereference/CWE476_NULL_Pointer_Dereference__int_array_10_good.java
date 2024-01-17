package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class CWE476_NULL_Pointer_Dereference__int_array_10_good extends AbstractTestCase {
    private void goodG2B1() throws Throwable {
        int[] data;
        if (IO.staticFalse) {
            data = null;
        } else {
            data = new int[5];
        }
        if (IO.staticTrue) {
            IO.writeLine("" + data.length);
        }
    }
    private void goodG2B2() throws Throwable {
        int[] data;
        if (IO.staticTrue) {
            data = new int[5];
        } else {
            data = null;
        }
        if (IO.staticTrue) {
            IO.writeLine("" + data.length);
        }
    }
    private void goodB2G1() throws Throwable {
        int[] data;
        if (IO.staticTrue) {
            data = null;
        } else {
            data = null;
        }
        if (IO.staticFalse) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data != null) {
                IO.writeLine("" + data.length);
            } else {
                IO.writeLine("data is null");
            }
        }
    }
    private void goodB2G2() throws Throwable {
        int[] data;
        if (IO.staticTrue) {
            data = null;
        } else {
            data = null;
        }
        if (IO.staticTrue) {
            if (data != null) {
                IO.writeLine("" + data.length);
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
