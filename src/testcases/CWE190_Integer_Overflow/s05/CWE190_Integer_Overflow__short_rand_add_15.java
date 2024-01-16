package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_rand_add_15 extends AbstractTestCase {
    public void bad() throws Throwable {
        short data;
        switch (6) {
            case 6:
                data = (short) ((new java.security.SecureRandom()).nextInt(1 + Short.MAX_VALUE - Short.MIN_VALUE) + Short.MIN_VALUE);
                break;
            default:
                data = 0;
                break;
        }
        switch (7) {
            case 7:
                short result = (short) (data + 1);
                IO.writeLine("result: " + result);
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void goodG2B1() throws Throwable {
        short data;
        switch (5) {
            case 6:
                data = 0;
                break;
            default:
                data = 2;
                break;
        }
        switch (7) {
            case 7:
                short result = (short) (data + 1);
                IO.writeLine("result: " + result);
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void goodG2B2() throws Throwable {
        short data;
        switch (6) {
            case 6:
                data = 2;
                break;
            default:
                data = 0;
                break;
        }
        switch (7) {
            case 7:
                short result = (short) (data + 1);
                IO.writeLine("result: " + result);
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void goodB2G1() throws Throwable {
        short data;
        switch (6) {
            case 6:
                data = (short) ((new java.security.SecureRandom()).nextInt(1 + Short.MAX_VALUE - Short.MIN_VALUE) + Short.MIN_VALUE);
                break;
            default:
                data = 0;
                break;
        }
        switch (8) {
            case 7:
                IO.writeLine("Benign, fixed string");
                break;
            default:
                if (data < Short.MAX_VALUE) {
                    short result = (short) (data + 1);
                    IO.writeLine("result: " + result);
                } else {
                    IO.writeLine("data value is too large to perform addition.");
                }
                break;
        }
    }
    private void goodB2G2() throws Throwable {
        short data;
        switch (6) {
            case 6:
                data = (short) ((new java.security.SecureRandom()).nextInt(1 + Short.MAX_VALUE - Short.MIN_VALUE) + Short.MIN_VALUE);
                break;
            default:
                data = 0;
                break;
        }
        switch (7) {
            case 7:
                if (data < Short.MAX_VALUE) {
                    short result = (short) (data + 1);
                    IO.writeLine("result: " + result);
                } else {
                    IO.writeLine("data value is too large to perform addition.");
                }
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
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