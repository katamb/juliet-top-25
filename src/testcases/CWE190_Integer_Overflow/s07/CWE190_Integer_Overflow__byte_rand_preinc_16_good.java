package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_rand_preinc_16_good extends AbstractTestCase {
    private void goodG2B() throws Throwable {
        byte data;
        while (true) {
            data = 2;
            break;
        }
        while (true) {
            byte result = (byte) (++data);
            IO.writeLine("result: " + result);
            break;
        }
    }
    private void goodB2G() throws Throwable {
        byte data;
        while (true) {
            data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
            break;
        }
        while (true) {
            if (data < Byte.MAX_VALUE) {
                byte result = (byte) (++data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
            break;
        }
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
