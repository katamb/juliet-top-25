package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15801 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void processG2B() throws Throwable {
        long dataCopy;
        {
            long data;
            data = 2;
            dataCopy = data;
        }
        {
            long data = dataCopy;
            long result = (long) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    private void processB2G() throws Throwable {
        long dataCopy;
        {
            long data;
            data = (new java.security.SecureRandom()).nextLong();
            dataCopy = data;
        }
        {
            long data = dataCopy;
            if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Long.MAX_VALUE))) {
                long result = (long) (data * data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform squaring.");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
