package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_rand_postinc_09 extends AbstractTestCase {
    public void bad() throws Throwable {
        long data;
        if (IO.STATIC_FINAL_TRUE) {
            data = (new java.security.SecureRandom()).nextLong();
        } else {
            data = 0L;
        }
        if (IO.STATIC_FINAL_TRUE) {
            data++;
            long result = (long) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B1() throws Throwable {
        long data;
        if (IO.STATIC_FINAL_FALSE) {
            data = 0L;
        } else {
            data = 2;
        }
        if (IO.STATIC_FINAL_TRUE) {
            data++;
            long result = (long) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B2() throws Throwable {
        long data;
        if (IO.STATIC_FINAL_TRUE) {
            data = 2;
        } else {
            data = 0L;
        }
        if (IO.STATIC_FINAL_TRUE) {
            data++;
            long result = (long) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G1() throws Throwable {
        long data;
        if (IO.STATIC_FINAL_TRUE) {
            data = (new java.security.SecureRandom()).nextLong();
        } else {
            data = 0L;
        }
        if (IO.STATIC_FINAL_FALSE) {
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
        if (IO.STATIC_FINAL_TRUE) {
            data = (new java.security.SecureRandom()).nextLong();
        } else {
            data = 0L;
        }
        if (IO.STATIC_FINAL_TRUE) {
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