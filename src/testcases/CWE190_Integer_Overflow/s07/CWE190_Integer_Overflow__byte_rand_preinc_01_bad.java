package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_rand_preinc_01_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        byte data;
        data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        byte result = (byte) (++data);
        IO.writeLine("result: " + result);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
