package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_max_postinc_17 extends AbstractTestCase {
    public void bad() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        for (int j = 0; j < 1; j++) {
            data++;
            long result = (long) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B() throws Throwable {
        long data;
        data = 2;
        for (int j = 0; j < 1; j++) {
            data++;
            long result = (long) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        for (int k = 0; k < 1; k++) {
            if (data < Long.MAX_VALUE) {
                data++;
                long result = (long) (data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}