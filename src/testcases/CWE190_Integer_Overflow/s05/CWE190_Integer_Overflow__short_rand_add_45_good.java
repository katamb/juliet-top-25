package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_rand_add_45_good extends AbstractTestCase {
    private short dataBad;
    private short dataGoodG2B;
    private short dataGoodB2G;
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2BSink() throws Throwable {
        short data = dataGoodG2B;
        short result = (short) (data + 1);
        IO.writeLine("result: " + result);
    }
    private void goodG2B() throws Throwable {
        short data;
        data = 2;
        dataGoodG2B = data;
        goodG2BSink();
    }
    private void goodB2GSink() throws Throwable {
        short data = dataGoodB2G;
        if (data < Short.MAX_VALUE) {
            short result = (short) (data + 1);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to perform addition.");
        }
    }
    private void goodB2G() throws Throwable {
        short data;
        data = (short) ((new java.security.SecureRandom()).nextInt(1 + Short.MAX_VALUE - Short.MIN_VALUE) + Short.MIN_VALUE);
        dataGoodB2G = data;
        goodB2GSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
