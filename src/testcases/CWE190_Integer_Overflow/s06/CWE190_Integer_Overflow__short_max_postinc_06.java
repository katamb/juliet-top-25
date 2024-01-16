package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_postinc_06 extends AbstractTestCase {
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;
    public void bad() throws Throwable {
        short data;
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data++;
            short result = (short) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B1() throws Throwable {
        short data;
        if (PRIVATE_STATIC_FINAL_FIVE != 5) {
            data = 0;
        } else {
            data = 2;
        }
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data++;
            short result = (short) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B2() throws Throwable {
        short data;
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data = 2;
        } else {
            data = 0;
        }
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data++;
            short result = (short) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G1() throws Throwable {
        short data;
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (PRIVATE_STATIC_FINAL_FIVE != 5) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data < Short.MAX_VALUE) {
                data++;
                short result = (short) (data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }
    private void goodB2G2() throws Throwable {
        short data;
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            if (data < Short.MAX_VALUE) {
                data++;
                short result = (short) (data);
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