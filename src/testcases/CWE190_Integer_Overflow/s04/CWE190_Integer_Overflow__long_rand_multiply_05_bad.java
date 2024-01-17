package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_rand_multiply_05_bad extends AbstractTestCase {
    private boolean privateTrue = true;
    private boolean privateFalse = false;
    public void bad() throws Throwable {
        long data;
        if (privateTrue) {
            data = (new java.security.SecureRandom()).nextLong();
        } else {
            data = 0L;
        }
        if (privateTrue) {
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
