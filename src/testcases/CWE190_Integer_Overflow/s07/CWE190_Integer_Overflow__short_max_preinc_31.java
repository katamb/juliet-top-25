package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_preinc_31 extends AbstractTestCase {
    public void bad() throws Throwable {
        short dataCopy;
        {
            short data;
            data = Short.MAX_VALUE;
            dataCopy = data;
        }
        {
            short data = dataCopy;
            short result = (short) (++data);
            IO.writeLine("result: " + result);
        }
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2B() throws Throwable {
        short dataCopy;
        {
            short data;
            data = 2;
            dataCopy = data;
        }
        {
            short data = dataCopy;
            short result = (short) (++data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G() throws Throwable {
        short dataCopy;
        {
            short data;
            data = Short.MAX_VALUE;
            dataCopy = data;
        }
        {
            short data = dataCopy;
            if (data < Short.MAX_VALUE) {
                short result = (short) (++data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}