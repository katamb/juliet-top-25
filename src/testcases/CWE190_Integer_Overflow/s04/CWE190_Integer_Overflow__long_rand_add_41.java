package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_rand_add_41 extends AbstractTestCase {
    private void badSink(long data) throws Throwable {
        long result = (long) (data + 1);
        IO.writeLine("result: " + result);
    }
    public void bad() throws Throwable {
        long data;
        data = (new java.security.SecureRandom()).nextLong();
        badSink(data);
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2BSink(long data) throws Throwable {
        long result = (long) (data + 1);
        IO.writeLine("result: " + result);
    }
    private void goodG2B() throws Throwable {
        long data;
        data = 2;
        goodG2BSink(data);
    }
    private void goodB2GSink(long data) throws Throwable {
        if (data < Long.MAX_VALUE) {
            long result = (long) (data + 1);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to perform addition.");
        }
    }
    private void goodB2G() throws Throwable {
        long data;
        data = (new java.security.SecureRandom()).nextLong();
        goodB2GSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}