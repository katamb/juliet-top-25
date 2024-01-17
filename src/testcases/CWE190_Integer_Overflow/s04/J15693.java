package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15693 extends AbstractTestCase {
    private void processG2B1() throws Throwable {
        long data;
        if (IO.STATIC_FINAL_FALSE) {
            data = 0L;
        } else {
            data = 2;
        }
        if (IO.STATIC_FINAL_TRUE) {
            long result = (long) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private void processG2B2() throws Throwable {
        long data;
        if (IO.STATIC_FINAL_TRUE) {
            data = 2;
        } else {
            data = 0L;
        }
        if (IO.STATIC_FINAL_TRUE) {
            long result = (long) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private void processB2G1() throws Throwable {
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
                long result = (long) (data + 1);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform addition.");
            }
        }
    }
    private void processB2G2() throws Throwable {
        long data;
        if (IO.STATIC_FINAL_TRUE) {
            data = (new java.security.SecureRandom()).nextLong();
        } else {
            data = 0L;
        }
        if (IO.STATIC_FINAL_TRUE) {
            if (data < Long.MAX_VALUE) {
                long result = (long) (data + 1);
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
