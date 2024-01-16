package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_rand_multiply_31 extends AbstractTestCase {
    public void bad() throws Throwable {
        long dataCopy;
        {
            long data;
            data = (new java.security.SecureRandom()).nextLong();
            dataCopy = data;
        }
        {
            long data = dataCopy;
            if (data > 0)  {
                long result = (long) (data * 2);
                IO.writeLine("result: " + result);
            }
        }
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2B() throws Throwable {
        long dataCopy;
        {
            long data;
            data = 2;
            dataCopy = data;
        }
        {
            long data = dataCopy;
            if (data > 0)  {
                long result = (long) (data * 2);
                IO.writeLine("result: " + result);
            }
        }
    }
    private void goodB2G() throws Throwable {
        long dataCopy;
        {
            long data;
            data = (new java.security.SecureRandom()).nextLong();
            dataCopy = data;
        }
        {
            long data = dataCopy;
            if (data > 0)  {
                if (data < (Long.MAX_VALUE / 2)) {
                    long result = (long) (data * 2);
                    IO.writeLine("result: " + result);
                } else {
                    IO.writeLine("data value is too large to perform multiplication.");
                }
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}