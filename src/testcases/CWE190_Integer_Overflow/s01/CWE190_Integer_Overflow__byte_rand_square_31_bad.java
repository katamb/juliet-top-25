package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_rand_square_31_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        byte dataCopy;
        {
            byte data;
            data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
            dataCopy = data;
        }
        {
            byte data = dataCopy;
            byte result = (byte) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
