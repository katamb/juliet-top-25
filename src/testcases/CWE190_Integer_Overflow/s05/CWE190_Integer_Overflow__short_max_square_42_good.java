package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_square_42_good extends AbstractTestCase {
    private short badSource() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        return data;
    }
    private short goodG2BSource() throws Throwable {
        short data;
        data = 2;
        return data;
    }
    private void goodG2B() throws Throwable {
        short data = goodG2BSource();
        short result = (short) (data * data);
        IO.writeLine("result: " + result);
    }
    private short goodB2GSource() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        return data;
    }
    private void goodB2G() throws Throwable {
        short data = goodB2GSource();
        if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Short.MAX_VALUE))) {
            short result = (short) (data * data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to perform squaring.");
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
