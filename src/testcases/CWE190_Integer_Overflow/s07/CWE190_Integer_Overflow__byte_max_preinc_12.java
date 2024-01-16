package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_max_preinc_12 extends AbstractTestCase {
    public void bad() throws Throwable {
        byte data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = Byte.MAX_VALUE;
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            byte result = (byte) (++data);
            IO.writeLine("result: " + result);
        } else {
            if (data < Byte.MAX_VALUE) {
                byte result = (byte) (++data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }
    private void goodG2B() throws Throwable {
        byte data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = 2;
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            byte result = (byte) (++data);
            IO.writeLine("result: " + result);
        } else {
            byte result = (byte) (++data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G() throws Throwable {
        byte data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = Byte.MAX_VALUE;
        } else {
            data = Byte.MAX_VALUE;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            if (data < Byte.MAX_VALUE) {
                byte result = (byte) (++data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        } else {
            if (data < Byte.MAX_VALUE) {
                byte result = (byte) (++data);
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