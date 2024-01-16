package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_rand_square_31 extends AbstractTestCase {
    public void bad() throws Throwable {
        short dataCopy;
        {
            short data;
            data = (short) ((new java.security.SecureRandom()).nextInt(1 + Short.MAX_VALUE - Short.MIN_VALUE) + Short.MIN_VALUE);
            dataCopy = data;
        }
        {
            short data = dataCopy;
            short result = (short) (data * data);
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
            short result = (short) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G() throws Throwable {
        short dataCopy;
        {
            short data;
            data = (short) ((new java.security.SecureRandom()).nextInt(1 + Short.MAX_VALUE - Short.MIN_VALUE) + Short.MIN_VALUE);
            dataCopy = data;
        }
        {
            short data = dataCopy;
            if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Short.MAX_VALUE))) {
                short result = (short) (data * data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform squaring.");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}