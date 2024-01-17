package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_rand_multiply_11_good extends AbstractTestCase {
    private void goodG2B1() throws Throwable {
        byte data;
        if (IO.staticReturnsFalse()) {
            data = 0;
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrue()) {
            if (data > 0)  {
                byte result = (byte) (data * 2);
                IO.writeLine("result: " + result);
            }
        }
    }
    private void goodG2B2() throws Throwable {
        byte data;
        if (IO.staticReturnsTrue()) {
            data = 2;
        } else {
            data = 0;
        }
        if (IO.staticReturnsTrue()) {
            if (data > 0)  {
                byte result = (byte) (data * 2);
                IO.writeLine("result: " + result);
            }
        }
    }
    private void goodB2G1() throws Throwable {
        byte data;
        if (IO.staticReturnsTrue()) {
            data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        } else {
            data = 0;
        }
        if (IO.staticReturnsFalse()) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data > 0)  {
                if (data < (Byte.MAX_VALUE / 2)) {
                    byte result = (byte) (data * 2);
                    IO.writeLine("result: " + result);
                } else {
                    IO.writeLine("data value is too large to perform multiplication.");
                }
            }
        }
    }
    private void goodB2G2() throws Throwable {
        byte data;
        if (IO.staticReturnsTrue()) {
            data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        } else {
            data = 0;
        }
        if (IO.staticReturnsTrue()) {
            if (data > 0)  {
                if (data < (Byte.MAX_VALUE / 2)) {
                    byte result = (byte) (data * 2);
                    IO.writeLine("result: " + result);
                } else {
                    IO.writeLine("data value is too large to perform multiplication.");
                }
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
