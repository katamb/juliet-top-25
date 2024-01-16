package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_max_preinc_42 extends AbstractTestCase {
    private long badSource() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        return data;
    }
    public void bad() throws Throwable {
        long data = badSource();
        long result = (long) (++data);
        IO.writeLine("result: " + result);
    }
    private long goodG2BSource() throws Throwable {
        long data;
        data = 2;
        return data;
    }
    private void goodG2B() throws Throwable {
        long data = goodG2BSource();
        long result = (long) (++data);
        IO.writeLine("result: " + result);
    }
    private long goodB2GSource() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        return data;
    }
    private void goodB2G() throws Throwable {
        long data = goodB2GSource();
        if (data < Long.MAX_VALUE) {
            long result = (long) (++data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to increment.");
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