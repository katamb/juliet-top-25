package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_rand_square_17_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        long data;
        data = (new java.security.SecureRandom()).nextLong();
        for (int j = 0; j < 1; j++) {
            long result = (long) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
