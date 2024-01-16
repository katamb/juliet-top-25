package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_rand_square_17 extends AbstractTestCase {
    public void bad() throws Throwable {
        long data;
        data = (new java.security.SecureRandom()).nextLong();
        for (int j = 0; j < 1; j++) {
            long result = (long) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B() throws Throwable {
        long data;
        data = 2;
        for (int j = 0; j < 1; j++) {
            long result = (long) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G() throws Throwable {
        long data;
        data = (new java.security.SecureRandom()).nextLong();
        for (int k = 0; k < 1; k++) {
            if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Long.MAX_VALUE))) {
                long result = (long) (data * data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform squaring.");
            }
        }
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}