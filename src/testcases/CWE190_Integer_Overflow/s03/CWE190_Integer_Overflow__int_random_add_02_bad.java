package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class CWE190_Integer_Overflow__int_random_add_02_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        if (true) {
            data = (new SecureRandom()).nextInt();
        } else {
            data = 0;
        }
        if (true) {
            int result = (int) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
