package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17137 extends AbstractTestCase {
    private boolean privateTrue = true;
    private boolean privateFalse = false;
    private void processG2B1() throws Throwable {
        short data;
        if (privateFalse) {
            data = 0;
        } else {
            data = 2;
        }
        if (privateTrue) {
            data++;
            short result = (short) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void processG2B2() throws Throwable {
        short data;
        if (privateTrue) {
            data = 2;
        } else {
            data = 0;
        }
        if (privateTrue) {
            data++;
            short result = (short) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void processB2G1() throws Throwable {
        short data;
        if (privateTrue) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (privateFalse) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data < Short.MAX_VALUE) {
                data++;
                short result = (short) (data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }
    private void processB2G2() throws Throwable {
        short data;
        if (privateTrue) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (privateTrue) {
            if (data < Short.MAX_VALUE) {
                data++;
                short result = (short) (data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
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
