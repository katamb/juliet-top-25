package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__int_max_preinc_08_good extends AbstractTestCase {
    private boolean privateReturnsTrue() {
        return true;
    }
    private boolean privateReturnsFalse() {
        return false;
    }
    private void goodG2B1() throws Throwable {
        int data;
        if (privateReturnsFalse()) {
            data = 0;
        } else {
            data = 2;
        }
        if (privateReturnsTrue()) {
            int result = (int) (++data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B2() throws Throwable {
        int data;
        if (privateReturnsTrue()) {
            data = 2;
        } else {
            data = 0;
        }
        if (privateReturnsTrue()) {
            int result = (int) (++data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G1() throws Throwable {
        int data;
        if (privateReturnsTrue()) {
            data = Integer.MAX_VALUE;
        } else {
            data = 0;
        }
        if (privateReturnsFalse()) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data < Integer.MAX_VALUE) {
                int result = (int) (++data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }
    private void goodB2G2() throws Throwable {
        int data;
        if (privateReturnsTrue()) {
            data = Integer.MAX_VALUE;
        } else {
            data = 0;
        }
        if (privateReturnsTrue()) {
            if (data < Integer.MAX_VALUE) {
                int result = (int) (++data);
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
