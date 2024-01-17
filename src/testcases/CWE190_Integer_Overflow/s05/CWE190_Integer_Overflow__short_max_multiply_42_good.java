package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_multiply_42_good extends AbstractTestCase {
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
        if (data > 0)  {
            short result = (short) (data * 2);
            IO.writeLine("result: " + result);
        }
    }
    private short goodB2GSource() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        return data;
    }
    private void goodB2G() throws Throwable {
        short data = goodB2GSource();
        if (data > 0)  {
            if (data < (Short.MAX_VALUE / 2)) {
                short result = (short) (data * 2);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform multiplication.");
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
