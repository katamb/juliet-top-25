package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_rand_add_31_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        long dataCopy;
        {
            long data;
            data = (new java.security.SecureRandom()).nextLong();
            dataCopy = data;
        }
        {
            long data = dataCopy;
            long result = (long) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
