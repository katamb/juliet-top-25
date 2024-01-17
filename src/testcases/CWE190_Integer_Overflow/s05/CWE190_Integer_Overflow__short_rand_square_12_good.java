package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_rand_square_12_good extends AbstractTestCase {
    private void goodG2B() throws Throwable {
        short data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = 2;
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            short result = (short) (data * data);
            IO.writeLine("result: " + result);
        } else {
            short result = (short) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G() throws Throwable {
        short data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = (short) ((new java.security.SecureRandom()).nextInt(1 + Short.MAX_VALUE - Short.MIN_VALUE) + Short.MIN_VALUE);
        } else {
            data = (short) ((new java.security.SecureRandom()).nextInt(1 + Short.MAX_VALUE - Short.MIN_VALUE) + Short.MIN_VALUE);
        }
        if (IO.staticReturnsTrueOrFalse()) {
            if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Short.MAX_VALUE))) {
                short result = (short) (data * data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform squaring.");
            }
        } else {
            if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Short.MAX_VALUE))) {
                short result = (short) (data * data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform squaring.");
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
