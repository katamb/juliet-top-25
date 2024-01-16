package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_max_square_05 extends AbstractTestCase {
    private boolean privateTrue = true;
    private boolean privateFalse = false;
    public void bad() throws Throwable {
        long data;
        if (privateTrue) {
            data = Long.MAX_VALUE;
        } else {
            data = 0L;
        }
        if (privateTrue) {
            long result = (long) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B1() throws Throwable {
        long data;
        if (privateFalse) {
            data = 0L;
        } else {
            data = 2;
        }
        if (privateTrue) {
            long result = (long) (data * data);
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
            long result = (long) (data * data);
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
            if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Long.MAX_VALUE))) {
                long result = (long) (data * data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform squaring.");
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
            if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Long.MAX_VALUE))) {
                long result = (long) (data * data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform squaring.");
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