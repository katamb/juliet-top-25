package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_add_10_good extends AbstractTestCase {
    private void goodG2B1() throws Throwable {
        short data;
        if (IO.staticFalse) {
            data = 0;
        } else {
            data = 2;
        }
        if (IO.staticTrue) {
            short result = (short) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B2() throws Throwable {
        short data;
        if (IO.staticTrue) {
            data = 2;
        } else {
            data = 0;
        }
        if (IO.staticTrue) {
            short result = (short) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G1() throws Throwable {
        short data;
        if (IO.staticTrue) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (IO.staticFalse) {
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
        if (IO.staticTrue) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (IO.staticTrue) {
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
