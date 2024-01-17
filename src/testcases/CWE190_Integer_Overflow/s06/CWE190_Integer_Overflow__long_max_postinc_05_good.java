package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_max_postinc_05_good extends AbstractTestCase {
    private boolean privateTrue = true;
    private boolean privateFalse = false;
    private void goodG2B1() throws Throwable {
        long data;
        if (privateFalse) {
            data = 0L;
        } else {
            data = 2;
        }
        if (privateTrue) {
            data++;
            long result = (long) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B2() throws Throwable {
        long data;
        if (privateTrue) {
            data = 2;
        } else {
            data = 0L;
        }
        if (privateTrue) {
            data++;
            long result = (long) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G1() throws Throwable {
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
                data++;
                long result = (long) (data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }
    private void goodB2G2() throws Throwable {
        long data;
        if (privateTrue) {
            data = Long.MAX_VALUE;
        } else {
            data = 0L;
        }
        if (privateTrue) {
            if (data < Long.MAX_VALUE) {
                data++;
                long result = (long) (data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
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
