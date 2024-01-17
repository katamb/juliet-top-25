package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_rand_preinc_12_good extends AbstractTestCase {
    private void goodG2B() throws Throwable {
        long data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = 2;
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            long result = (long) (++data);
            IO.writeLine("result: " + result);
        } else {
            long result = (long) (++data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G() throws Throwable {
        long data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = (new java.security.SecureRandom()).nextLong();
        } else {
            data = (new java.security.SecureRandom()).nextLong();
        }
        if (IO.staticReturnsTrueOrFalse()) {
            if (data < Long.MAX_VALUE) {
                long result = (long) (++data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        } else {
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
