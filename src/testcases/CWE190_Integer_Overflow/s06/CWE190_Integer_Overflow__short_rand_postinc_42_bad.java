package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_rand_postinc_42_bad extends AbstractTestCase {
    private short badSource() throws Throwable {
        short data;
        data = (short) ((new java.security.SecureRandom()).nextInt(1 + Short.MAX_VALUE - Short.MIN_VALUE) + Short.MIN_VALUE);
        return data;
    }
    public void bad() throws Throwable {
        short data = badSource();
        data++;
        short result = (short) (data);
        IO.writeLine("result: " + result);
    }
    private short goodG2BSource() throws Throwable {
        short data;
        data = 2;
        return data;
    }
    private short goodB2GSource() throws Throwable {
        short data;
        data = (short) ((new java.security.SecureRandom()).nextInt(1 + Short.MAX_VALUE - Short.MIN_VALUE) + Short.MIN_VALUE);
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
