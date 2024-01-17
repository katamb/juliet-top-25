package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_max_postinc_16_good extends AbstractTestCase {
    private void goodG2B() throws Throwable {
        long data;
        while (true) {
            data = 2;
            break;
        }
        while (true) {
            data++;
            long result = (long) (data);
            IO.writeLine("result: " + result);
            break;
        }
    }
    private void goodB2G() throws Throwable {
        long data;
        while (true) {
            data = Long.MAX_VALUE;
            break;
        }
        while (true) {
            if (data < Long.MAX_VALUE) {
                data++;
                long result = (long) (data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
            break;
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
