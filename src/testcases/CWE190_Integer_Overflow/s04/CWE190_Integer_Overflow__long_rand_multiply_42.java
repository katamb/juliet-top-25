package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_rand_multiply_42 extends AbstractTestCase {
    private long badSource() throws Throwable {
        long data;
        data = (new java.security.SecureRandom()).nextLong();
        return data;
    }
    public void bad() throws Throwable {
        long data = badSource();
        if (data > 0)  {
            long result = (long) (data * 2);
            IO.writeLine("result: " + result);
        }
    }
    private long goodG2BSource() throws Throwable {
        long data;
        data = 2;
        return data;
    }
    private void goodG2B() throws Throwable {
        long data = goodG2BSource();
        if (data > 0)  {
            long result = (long) (data * 2);
            IO.writeLine("result: " + result);
        }
    }
    private long goodB2GSource() throws Throwable {
        long data;
        data = (new java.security.SecureRandom()).nextLong();
        return data;
    }
    private void goodB2G() throws Throwable {
        long data = goodB2GSource();
        if (data > 0)  {
            if (data < (Long.MAX_VALUE / 2)) {
                long result = (long) (data * 2);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform multiplication.");
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