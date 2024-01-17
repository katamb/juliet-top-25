package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class CWE190_Integer_Overflow__int_random_preinc_16_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        while (true) {
            data = (new SecureRandom()).nextInt();
            break;
        }
        while (true) {
            int result = (int) (++data);
            IO.writeLine("result: " + result);
            break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
