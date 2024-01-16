package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_postinc_01 extends AbstractTestCase {
    public void bad() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        data++;
        short result = (short) (data);
        IO.writeLine("result: " + result);
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2B() throws Throwable {
        short data;
        data = 2;
        data++;
        short result = (short) (data);
        IO.writeLine("result: " + result);
    }
    private void goodB2G() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        if (data < Short.MAX_VALUE) {
            data++;
            short result = (short) (data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to increment.");
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}