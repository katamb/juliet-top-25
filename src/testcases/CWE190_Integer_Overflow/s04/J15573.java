package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15573 extends AbstractTestCase {
    private void goodG2B1() throws Throwable {
        long data;
        switch (5) {
            case 6:
                data = 0L;
                break;
            default:
                data = 2;
                break;
        }
        switch (7) {
            case 7:
                long result = (long) (data + 1);
                IO.writeLine("result: " + result);
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void goodG2B2() throws Throwable {
        long data;
        switch (6) {
            case 6:
                data = 2;
                break;
            default:
                data = 0L;
                break;
        }
        switch (7) {
            case 7:
                long result = (long) (data + 1);
                IO.writeLine("result: " + result);
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void goodB2G1() throws Throwable {
        long data;
        switch (6) {
            case 6:
                data = Long.MAX_VALUE;
                break;
            default:
                data = 0L;
                break;
        }
        switch (8) {
            case 7:
                IO.writeLine("Benign, fixed string");
                break;
            default:
                if (data < Long.MAX_VALUE) {
                    long result = (long) (data + 1);
                    IO.writeLine("result: " + result);
                } else {
                    IO.writeLine("data value is too large to perform addition.");
                }
                break;
        }
    }
    private void goodB2G2() throws Throwable {
        long data;
        switch (6) {
            case 6:
                data = Long.MAX_VALUE;
                break;
            default:
                data = 0L;
                break;
        }
        switch (7) {
            case 7:
                if (data < Long.MAX_VALUE) {
                    long result = (long) (data + 1);
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
    public void process() throws Throwable {
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
