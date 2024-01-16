package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_rand_add_42 extends AbstractTestCase {
    private short badSource() throws Throwable {
        short data;
        data = (short) ((new java.security.SecureRandom()).nextInt(1 + Short.MAX_VALUE - Short.MIN_VALUE) + Short.MIN_VALUE);
        return data;
    }
    public void bad() throws Throwable {
        short data = badSource();
        short result = (short) (data + 1);
        IO.writeLine("result: " + result);
    }
    private short goodG2BSource() throws Throwable {
        short data;
        data = 2;
        return data;
    }
    private void goodG2B() throws Throwable {
        short data = goodG2BSource();
        short result = (short) (data + 1);
        IO.writeLine("result: " + result);
    }
    private short goodB2GSource() throws Throwable {
        short data;
        data = (short) ((new java.security.SecureRandom()).nextInt(1 + Short.MAX_VALUE - Short.MIN_VALUE) + Short.MIN_VALUE);
        return data;
    }
    private void goodB2G() throws Throwable {
        short data = goodB2GSource();
        if (data < Short.MAX_VALUE) {
            short result = (short) (data + 1);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to perform addition.");
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