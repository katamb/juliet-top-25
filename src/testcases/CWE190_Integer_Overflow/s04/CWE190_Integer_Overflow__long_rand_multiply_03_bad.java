package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_rand_multiply_03_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        long data;
        if (5 == 5) {
            data = (new java.security.SecureRandom()).nextLong();
        } else {
            data = 0L;
        }
        if (5 == 5) {
            if (data > 0)  {
                long result = (long) (data * 2);
                IO.writeLine("result: " + result);
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
