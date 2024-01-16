package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_max_add_06 extends AbstractTestCase {
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;
    public void bad() throws Throwable {
        long data;
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data = Long.MAX_VALUE;
        } else {
            data = 0L;
        }
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            long result = (long) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B1() throws Throwable {
        long data;
        if (PRIVATE_STATIC_FINAL_FIVE != 5) {
            data = 0L;
        } else {
            data = 2;
        }
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            long result = (long) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B2() throws Throwable {
        long data;
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data = 2;
        } else {
            data = 0L;
        }
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            long result = (long) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G1() throws Throwable {
        long data;
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data = Long.MAX_VALUE;
        } else {
            data = 0L;
        }
        if (PRIVATE_STATIC_FINAL_FIVE != 5) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data < Long.MAX_VALUE) {
                long result = (long) (data + 1);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform addition.");
            }
        }
    }
    private void goodB2G2() throws Throwable {
        long data;
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data = Long.MAX_VALUE;
        } else {
            data = 0L;
        }
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            if (data < Long.MAX_VALUE) {
                long result = (long) (data + 1);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform addition.");
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