package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_rand_preinc_09_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        short data;
        if (IO.STATIC_FINAL_TRUE) {
            data = (short) ((new java.security.SecureRandom()).nextInt(1 + Short.MAX_VALUE - Short.MIN_VALUE) + Short.MIN_VALUE);
        } else {
            data = 0;
        }
        if (IO.STATIC_FINAL_TRUE) {
            short result = (short) (++data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
