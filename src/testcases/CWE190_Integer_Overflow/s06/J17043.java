package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17043 extends AbstractTestCase {
    private void processG2B1() throws Throwable {
        long data;
        if (false) {
            data = 0L;
        } else {
            data = 2;
        }
        if (true) {
            data++;
            long result = (long) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void processG2B2() throws Throwable {
        long data;
        if (true) {
            data = 2;
        } else {
            data = 0L;
        }
        if (true) {
            data++;
            long result = (long) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void processB2G1() throws Throwable {
        long data;
        if (true) {
            data = (new java.security.SecureRandom()).nextLong();
        } else {
            data = 0L;
        }
        if (false) {
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
    private void processB2G2() throws Throwable {
        long data;
        if (true) {
            data = (new java.security.SecureRandom()).nextLong();
        } else {
            data = 0L;
        }
        if (true) {
            if (data < Long.MAX_VALUE) {
                data++;
                long result = (long) (data);
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
