package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class CWE190_Integer_Overflow__int_random_multiply_10_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        if (IO.staticTrue) {
            data = (new SecureRandom()).nextInt();
        } else {
            data = 0;
        }
        if (IO.staticTrue) {
            if (data > 0)  {
                int result = (int) (data * 2);
                IO.writeLine("result: " + result);
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
