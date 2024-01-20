package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17079 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void gG2BS(long data) throws Throwable {
        data++;
        long result = (long) (data);
        IO.writeLine("result: " + result);
    }
    private void processG2B() throws Throwable {
        long data;
        data = 2;
        gG2BS(data);
    }
    private void gB2GS(long data) throws Throwable {
        if (data < Long.MAX_VALUE) {
            data++;
            long result = (long) (data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to increment.");
        }
    }
    private void processB2G() throws Throwable {
        long data;
        data = (new java.security.SecureRandom()).nextLong();
        gB2GS(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
