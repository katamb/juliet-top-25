package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_rand_square_10_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        long data;
        if (IO.staticTrue) {
            data = (new java.security.SecureRandom()).nextLong();
        } else {
            data = 0L;
        }
        if (IO.staticTrue) {
            long result = (long) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
