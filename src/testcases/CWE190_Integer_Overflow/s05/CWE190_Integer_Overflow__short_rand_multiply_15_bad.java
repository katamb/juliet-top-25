package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_rand_multiply_15_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        short data;
        switch (6) {
            case 6:
                data = (short) ((new java.security.SecureRandom()).nextInt(1 + Short.MAX_VALUE - Short.MIN_VALUE) + Short.MIN_VALUE);
                break;
            default:
                data = 0;
                break;
        }
        switch (7) {
            case 7:
                if (data > 0)  {
                    short result = (short) (data * 2);
                    IO.writeLine("result: " + result);
                }
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
