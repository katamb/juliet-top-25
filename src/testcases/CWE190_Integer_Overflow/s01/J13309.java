package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J13309 extends AbstractTestCase {
    private boolean privateTrue = true;
    private boolean privateFalse = false;
    private void processG2B1() throws Throwable {
        byte data;
        if (privateFalse) {
            data = 0;
        } else {
            data = 2;
        }
        if (privateTrue) {
            byte result = (byte) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private void processG2B2() throws Throwable {
        byte data;
        if (privateTrue) {
            data = 2;
        } else {
            data = 0;
        }
        if (privateTrue) {
            byte result = (byte) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private void processB2G1() throws Throwable {
        byte data;
        if (privateTrue) {
            data = Byte.MAX_VALUE;
        } else {
            data = 0;
        }
        if (privateFalse) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data < Byte.MAX_VALUE) {
                byte result = (byte) (data + 1);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform addition.");
            }
        }
    }
    private void processB2G2() throws Throwable {
        byte data;
        if (privateTrue) {
            data = Byte.MAX_VALUE;
        } else {
            data = 0;
        }
        if (privateTrue) {
            if (data < Byte.MAX_VALUE) {
                byte result = (byte) (data + 1);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform addition.");
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
