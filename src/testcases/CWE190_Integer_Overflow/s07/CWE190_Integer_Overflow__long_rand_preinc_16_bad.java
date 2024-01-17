package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_rand_preinc_16_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        long data;
        while (true) {
            data = (new java.security.SecureRandom()).nextLong();
            break;
        }
        while (true) {
            long result = (long) (++data);
            IO.writeLine("result: " + result);
            break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
