package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_add_03 extends AbstractTestCase {
    public void bad() throws Throwable {
        short data;
        if (5 == 5) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (5 == 5) {
            short result = (short) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B1() throws Throwable {
        short data;
        if (5 != 5) {
            data = 0;
        } else {
            data = 2;
        }
        if (5 == 5) {
            short result = (short) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B2() throws Throwable {
        short data;
        if (5 == 5) {
            data = 2;
        } else {
            data = 0;
        }
        if (5 == 5) {
            short result = (short) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G1() throws Throwable {
        short data;
        if (5 == 5) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (5 != 5) {
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
        if (5 == 5) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (5 == 5) {
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