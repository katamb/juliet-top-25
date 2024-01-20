package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17211 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void gG2BS(short data) throws Throwable {
        data++;
        short result = (short) (data);
        IO.writeLine("result: " + result);
    }
    private void processG2B() throws Throwable {
        short data;
        data = 2;
        gG2BS(data);
    }
    private void gB2GS(short data) throws Throwable {
        if (data < Short.MAX_VALUE) {
            data++;
            short result = (short) (data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to increment.");
        }
    }
    private void processB2G() throws Throwable {
        short data;
        data = (short) ((new java.security.SecureRandom()).nextInt(1 + Short.MAX_VALUE - Short.MIN_VALUE) + Short.MIN_VALUE);
        gB2GS(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
