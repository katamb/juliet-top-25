package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_rand_add_45_bad extends AbstractTestCase {
    private byte dataBad;
    private byte dataGoodG2B;
    private byte dataGoodB2G;
    private void badSink() throws Throwable {
        byte data = dataBad;
        byte result = (byte) (data + 1);
        IO.writeLine("result: " + result);
    }
    public void bad() throws Throwable {
        byte data;
        data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        dataBad = data;
        badSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
