package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_rand_square_31_good extends AbstractTestCase {
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2B() throws Throwable {
        byte dataCopy;
        {
            byte data;
            data = 2;
            dataCopy = data;
        }
        {
            byte data = dataCopy;
            byte result = (byte) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G() throws Throwable {
        byte dataCopy;
        {
            byte data;
            data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
            dataCopy = data;
        }
        {
            byte data = dataCopy;
            if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Byte.MAX_VALUE))) {
                byte result = (byte) (data * data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform squaring.");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
