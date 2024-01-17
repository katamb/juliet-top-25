package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_preinc_12_good extends AbstractTestCase {
    private void goodG2B() throws Throwable {
        short data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = 2;
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            short result = (short) (++data);
            IO.writeLine("result: " + result);
        } else {
            short result = (short) (++data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G() throws Throwable {
        short data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = Short.MAX_VALUE;
        } else {
            data = Short.MAX_VALUE;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            if (data < Short.MAX_VALUE) {
                short result = (short) (++data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        } else {
            if (data < Short.MAX_VALUE) {
                short result = (short) (++data);
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
