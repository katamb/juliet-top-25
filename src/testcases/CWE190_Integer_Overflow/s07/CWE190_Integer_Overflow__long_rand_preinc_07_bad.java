package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_rand_preinc_07_bad extends AbstractTestCase {
    private int privateFive = 5;
    public void bad() throws Throwable {
        long data;
        if (privateFive == 5) {
            data = (new java.security.SecureRandom()).nextLong();
        } else {
            data = 0L;
        }
        if (privateFive == 5) {
            long result = (long) (++data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
