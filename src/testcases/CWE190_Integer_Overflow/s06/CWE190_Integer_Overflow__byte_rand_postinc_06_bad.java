package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_rand_postinc_06_bad extends AbstractTestCase {
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;
    public void bad() throws Throwable {
        byte data;
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        } else {
            data = 0;
        }
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data++;
            byte result = (byte) (data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
