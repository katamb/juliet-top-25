package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_rand_preinc_17_good extends AbstractTestCase {
    private void goodG2B() throws Throwable {
        long data;
        data = 2;
        for (int j = 0; j < 1; j++) {
            long result = (long) (++data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G() throws Throwable {
        long data;
        data = (new java.security.SecureRandom()).nextLong();
        for (int k = 0; k < 1; k++) {
            if (data < Long.MAX_VALUE) {
                long result = (long) (++data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
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
