package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J18017 extends AbstractTestCase {
    private boolean privateTrue = true;
    private boolean privateFalse = false;
    private void processG2B1() throws Throwable {
        long data;
        if (privateFalse) {
            data = 0L;
        } else {
            data = 2;
        }
        if (privateTrue) {
            long result = (long) (++data);
            IO.writeLine("result: " + result);
        }
    }
    private void processG2B2() throws Throwable {
        long data;
        if (privateTrue) {
            data = 2;
        } else {
            data = 0L;
        }
        if (privateTrue) {
            long result = (long) (++data);
            IO.writeLine("result: " + result);
        }
    }
    private void processB2G1() throws Throwable {
        long data;
        if (privateTrue) {
            data = Long.MAX_VALUE;
        } else {
            data = 0L;
        }
        if (privateFalse) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data < Long.MAX_VALUE) {
                long result = (long) (++data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }
    private void processB2G2() throws Throwable {
        long data;
        if (privateTrue) {
            data = Long.MAX_VALUE;
        } else {
            data = 0L;
        }
        if (privateTrue) {
            if (data < Long.MAX_VALUE) {
                long result = (long) (++data);
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
