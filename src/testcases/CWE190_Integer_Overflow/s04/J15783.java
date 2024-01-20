package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15783 extends AbstractTestCase {
    private void processG2B1() throws Throwable {
        long data;
        if (IO.staticFalse) {
            data = 0L;
        } else {
            data = 2;
        }
        if (IO.staticTrue) {
            long result = (long) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    private void processG2B2() throws Throwable {
        long data;
        if (IO.staticTrue) {
            data = 2;
        } else {
            data = 0L;
        }
        if (IO.staticTrue) {
            long result = (long) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    private void processB2G1() throws Throwable {
        long data;
        if (IO.staticTrue) {
            data = (new java.security.SecureRandom()).nextLong();
        } else {
            data = 0L;
        }
        if (IO.staticFalse) {
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
    private void processB2G2() throws Throwable {
        long data;
        if (IO.staticTrue) {
            data = (new java.security.SecureRandom()).nextLong();
        } else {
            data = 0L;
        }
        if (IO.staticTrue) {
            if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Long.MAX_VALUE))) {
                long result = (long) (data * data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform squaring.");
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
