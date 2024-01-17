package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_rand_postinc_15_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        byte data;
        switch (6) {
            case 6:
                data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
                break;
            default:
                data = 0;
                break;
        }
        switch (7) {
            case 7:
                data++;
                byte result = (byte) (data);
                IO.writeLine("result: " + result);
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
