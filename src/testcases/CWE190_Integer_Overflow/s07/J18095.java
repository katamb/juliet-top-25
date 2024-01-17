package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J18095 extends AbstractTestCase {
    private long dataB;
    private long dataGdG2B;
    private long dataGdB2G;
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void gG2BSink() throws Throwable {
        long data = dataGdG2B;
        long result = (long) (++data);
        IO.writeLine("result: " + result);
    }
    private void processG2B() throws Throwable {
        long data;
        data = 2;
        dataGdG2B = data;
        gG2BSink();
    }
    private void gB2GSink() throws Throwable {
        long data = dataGdB2G;
        if (data < Long.MAX_VALUE) {
            long result = (long) (++data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to increment.");
        }
    }
    private void processB2G() throws Throwable {
        long data;
        data = (new java.security.SecureRandom()).nextLong();
        dataGdB2G = data;
        gB2GSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
