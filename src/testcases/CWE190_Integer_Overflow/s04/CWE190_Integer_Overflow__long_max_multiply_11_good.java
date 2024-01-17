package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_max_multiply_11_good extends AbstractTestCase {
    private void goodG2B1() throws Throwable {
        long data;
        if (IO.staticReturnsFalse()) {
            data = 0L;
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrue()) {
            if (data > 0)  {
                long result = (long) (data * 2);
                IO.writeLine("result: " + result);
            }
        }
    }
    private void goodG2B2() throws Throwable {
        long data;
        if (IO.staticReturnsTrue()) {
            data = 2;
        } else {
            data = 0L;
        }
        if (IO.staticReturnsTrue()) {
            if (data > 0)  {
                long result = (long) (data * 2);
                IO.writeLine("result: " + result);
            }
        }
    }
    private void goodB2G1() throws Throwable {
        long data;
        if (IO.staticReturnsTrue()) {
            data = Long.MAX_VALUE;
        } else {
            data = 0L;
        }
        if (IO.staticReturnsFalse()) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data > 0)  {
                if (data < (Long.MAX_VALUE / 2)) {
                    long result = (long) (data * 2);
                    IO.writeLine("result: " + result);
                } else {
                    IO.writeLine("data value is too large to perform multiplication.");
                }
            }
        }
    }
    private void goodB2G2() throws Throwable {
        long data;
        if (IO.staticReturnsTrue()) {
            data = Long.MAX_VALUE;
        } else {
            data = 0L;
        }
        if (IO.staticReturnsTrue()) {
            if (data > 0)  {
                if (data < (Long.MAX_VALUE / 2)) {
                    long result = (long) (data * 2);
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
