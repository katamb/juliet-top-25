package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_rand_postinc_01_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        long data;
        data = (new java.security.SecureRandom()).nextLong();
        data++;
        long result = (long) (data);
        IO.writeLine("result: " + result);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
