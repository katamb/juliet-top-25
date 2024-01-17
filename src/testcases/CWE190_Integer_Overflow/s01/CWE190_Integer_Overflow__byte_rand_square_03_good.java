package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_rand_square_03_good extends AbstractTestCase {
    private void goodG2B1() throws Throwable {
        byte data;
        if (5 != 5) {
            data = 0;
        } else {
            data = 2;
        }
        if (5 == 5) {
            byte result = (byte) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B2() throws Throwable {
        byte data;
        if (5 == 5) {
            data = 2;
        } else {
            data = 0;
        }
        if (5 == 5) {
            byte result = (byte) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G1() throws Throwable {
        byte data;
        if (5 == 5) {
            data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        } else {
            data = 0;
        }
        if (5 != 5) {
            IO.writeLine("Benign, fixed string");
        } else {
            if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Byte.MAX_VALUE))) {
                byte result = (byte) (data * data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform squaring.");
            }
        }
    }
    private void goodB2G2() throws Throwable {
        byte data;
        if (5 == 5) {
            data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        } else {
            data = 0;
        }
        if (5 == 5) {
            if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Byte.MAX_VALUE))) {
                byte result = (byte) (data * data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform squaring.");
            }
        }
    }
    public void good() throws Throwable {
        goodG2B1();
        goodG2B2();
        goodB2G1();
        goodB2G2();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
