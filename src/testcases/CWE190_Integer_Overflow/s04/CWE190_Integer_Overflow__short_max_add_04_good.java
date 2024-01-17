package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_add_04_good extends AbstractTestCase {
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;
    private void goodG2B1() throws Throwable {
        short data;
        if (PRIVATE_STATIC_FINAL_FALSE) {
            data = 0;
        } else {
            data = 2;
        }
        if (PRIVATE_STATIC_FINAL_TRUE) {
            short result = (short) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B2() throws Throwable {
        short data;
        if (PRIVATE_STATIC_FINAL_TRUE) {
            data = 2;
        } else {
            data = 0;
        }
        if (PRIVATE_STATIC_FINAL_TRUE) {
            short result = (short) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G1() throws Throwable {
        short data;
        if (PRIVATE_STATIC_FINAL_TRUE) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (PRIVATE_STATIC_FINAL_FALSE) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data < Short.MAX_VALUE) {
                short result = (short) (data + 1);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform addition.");
            }
        }
    }
    private void goodB2G2() throws Throwable {
        short data;
        if (PRIVATE_STATIC_FINAL_TRUE) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (PRIVATE_STATIC_FINAL_TRUE) {
            if (data < Short.MAX_VALUE) {
                short result = (short) (data + 1);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform addition.");
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
