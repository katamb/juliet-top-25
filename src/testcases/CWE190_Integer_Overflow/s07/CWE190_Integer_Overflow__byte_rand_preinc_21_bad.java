package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_rand_preinc_21_bad extends AbstractTestCase {
    private boolean badPrivate = false;
    public void bad() throws Throwable {
        byte data;
        data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        badPrivate = true;
        badSink(data);
    }
    private void badSink(byte data) throws Throwable {
        if (badPrivate) {
            byte result = (byte) (++data);
            IO.writeLine("result: " + result);
        }
    }
    private boolean goodB2G1Private = false;
    private boolean goodB2G2Private = false;
    private boolean goodG2BPrivate = false;
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
