package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_max_postinc_04 extends AbstractTestCase {
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;
    public void bad() throws Throwable {
        byte data;
        if (PRIVATE_STATIC_FINAL_TRUE) {
            data = Byte.MAX_VALUE;
        } else {
            data = 0;
        }
        if (PRIVATE_STATIC_FINAL_TRUE) {
            data++;
            byte result = (byte) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B1() throws Throwable {
        byte data;
        if (PRIVATE_STATIC_FINAL_FALSE) {
            data = 0;
        } else {
            data = 2;
        }
        if (PRIVATE_STATIC_FINAL_TRUE) {
            data++;
            byte result = (byte) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B2() throws Throwable {
        byte data;
        if (PRIVATE_STATIC_FINAL_TRUE) {
            data = 2;
        } else {
            data = 0;
        }
        if (PRIVATE_STATIC_FINAL_TRUE) {
            data++;
            byte result = (byte) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G1() throws Throwable {
        byte data;
        if (PRIVATE_STATIC_FINAL_TRUE) {
            data = Byte.MAX_VALUE;
        } else {
            data = 0;
        }
        if (PRIVATE_STATIC_FINAL_FALSE) {
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
        if (PRIVATE_STATIC_FINAL_TRUE) {
            data = Byte.MAX_VALUE;
        } else {
            data = 0;
        }
        if (PRIVATE_STATIC_FINAL_TRUE) {
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