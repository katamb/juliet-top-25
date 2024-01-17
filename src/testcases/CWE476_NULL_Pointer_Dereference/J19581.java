package testcases.CWE476_NULL_Pointer_Dereference;
import testcasesupport.*;
public class J19581 extends AbstractTestCase {
    private boolean privateTrue = true;
    private boolean privateFalse = false;
    private void goodG2B1() throws Throwable {
        Integer data;
        if (privateFalse) {
            data = null;
        } else {
            data = Integer.valueOf(5);
        }
        if (privateTrue) {
            IO.writeLine("" + data.toString());
        }
    }
    private void goodG2B2() throws Throwable {
        Integer data;
        if (privateTrue) {
            data = Integer.valueOf(5);
        } else {
            data = null;
        }
        if (privateTrue) {
            IO.writeLine("" + data.toString());
        }
    }
    private void goodB2G1() throws Throwable {
        Integer data;
        if (privateTrue) {
            data = null;
        } else {
            data = null;
        }
        if (privateFalse) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data != null) {
                IO.writeLine("" + data.toString());
            } else {
                IO.writeLine("data is null");
            }
        }
    }
    private void goodB2G2() throws Throwable {
        Integer data;
        if (privateTrue) {
            data = null;
        } else {
            data = null;
        }
        if (privateTrue) {
            if (data != null) {
                IO.writeLine("" + data.toString());
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
