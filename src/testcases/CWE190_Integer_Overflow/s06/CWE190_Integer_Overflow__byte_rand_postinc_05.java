package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_rand_postinc_05 extends AbstractTestCase {
    private boolean privateTrue = true;
    private boolean privateFalse = false;
    public void bad() throws Throwable {
        byte data;
        if (privateTrue) {
            data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        } else {
            data = 0;
        }
        if (privateTrue) {
            data++;
            byte result = (byte) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B1() throws Throwable {
        byte data;
        if (privateFalse) {
            data = 0;
        } else {
            data = 2;
        }
        if (privateTrue) {
            data++;
            byte result = (byte) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B2() throws Throwable {
        byte data;
        if (privateTrue) {
            data = 2;
        } else {
            data = 0;
        }
        if (privateTrue) {
            data++;
            byte result = (byte) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G1() throws Throwable {
        byte data;
        if (privateTrue) {
            data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        } else {
            data = 0;
        }
        if (privateFalse) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data < Byte.MAX_VALUE) {
                data++;
                byte result = (byte) (data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }
    private void goodB2G2() throws Throwable {
        byte data;
        if (privateTrue) {
            data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        } else {
            data = 0;
        }
        if (privateTrue) {
            if (data < Byte.MAX_VALUE) {
                data++;
                byte result = (byte) (data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
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