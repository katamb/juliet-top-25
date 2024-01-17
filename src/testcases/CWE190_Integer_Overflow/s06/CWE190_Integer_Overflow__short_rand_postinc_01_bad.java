package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_rand_postinc_01_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        short data;
        data = (short) ((new java.security.SecureRandom()).nextInt(1 + Short.MAX_VALUE - Short.MIN_VALUE) + Short.MIN_VALUE);
        data++;
        short result = (short) (data);
        IO.writeLine("result: " + result);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
