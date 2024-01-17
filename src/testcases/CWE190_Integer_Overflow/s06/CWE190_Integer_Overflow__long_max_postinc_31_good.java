package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_max_postinc_31_good extends AbstractTestCase {
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
            data++;
            long result = (long) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G() throws Throwable {
        long dataCopy;
        {
            long data;
            data = Long.MAX_VALUE;
            dataCopy = data;
        }
        {
            long data = dataCopy;
            if (data < Long.MAX_VALUE) {
                data++;
                long result = (long) (data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
