package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class CWE190_Integer_Overflow__int_random_postinc_03_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        if (5 == 5) {
            data = (new SecureRandom()).nextInt();
        } else {
            data = 0;
        }
        if (5 == 5) {
            data++;
            int result = (int) (data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
