package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_rand_add_41_good extends AbstractTestCase {
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2BSink(short data) throws Throwable {
        short result = (short) (data + 1);
        IO.writeLine("result: " + result);
    }
    private void goodG2B() throws Throwable {
        short data;
        data = 2;
        goodG2BSink(data);
    }
    private void goodB2GSink(short data) throws Throwable {
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
        goodB2GSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
