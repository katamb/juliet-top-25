package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_square_16_good extends AbstractTestCase {
    private void goodG2B() throws Throwable {
        short data;
        while (true) {
            data = 2;
            break;
        }
        while (true) {
            short result = (short) (data * data);
            IO.writeLine("result: " + result);
            break;
        }
    }
    private void goodB2G() throws Throwable {
        short data;
        while (true) {
            data = Short.MAX_VALUE;
            break;
        }
        while (true) {
            if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Short.MAX_VALUE))) {
                short result = (short) (data * data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform squaring.");
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
