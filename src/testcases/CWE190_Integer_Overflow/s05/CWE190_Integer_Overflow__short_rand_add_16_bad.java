package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_rand_add_16_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        short data;
        while (true) {
            data = (short) ((new java.security.SecureRandom()).nextInt(1 + Short.MAX_VALUE - Short.MIN_VALUE) + Short.MIN_VALUE);
            break;
        }
        while (true) {
            short result = (short) (data + 1);
            IO.writeLine("result: " + result);
            break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
