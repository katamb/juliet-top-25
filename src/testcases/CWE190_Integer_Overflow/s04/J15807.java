package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15807 extends AbstractTestCase {
    private long dataBad;
    private long dataGoodG2B;
    private long dataGoodB2G;
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void goodG2BSink() throws Throwable {
        long data = dataGoodG2B;
        long result = (long) (data * data);
        IO.writeLine("result: " + result);
    }
    private void processG2B() throws Throwable {
        long data;
        data = 2;
        dataGoodG2B = data;
        goodG2BSink();
    }
    private void goodB2GSink() throws Throwable {
        long data = dataGoodB2G;
        if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Long.MAX_VALUE))) {
            long result = (long) (data * data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to perform squaring.");
        }
    }
    private void processB2G() throws Throwable {
        long data;
        data = (new java.security.SecureRandom()).nextLong();
        dataGoodB2G = data;
        goodB2GSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
