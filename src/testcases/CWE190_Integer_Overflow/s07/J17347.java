package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17347 extends AbstractTestCase {
    private byte dataB;
    private byte dataGdG2B;
    private byte dataGdB2G;
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void gG2BSink() throws Throwable {
        byte data = dataGdG2B;
        byte result = (byte) (++data);
        IO.writeLine("result: " + result);
    }
    private void processG2B() throws Throwable {
        byte data;
        data = 2;
        dataGdG2B = data;
        gG2BSink();
    }
    private void gB2GSink() throws Throwable {
        byte data = dataGdB2G;
        if (data < Byte.MAX_VALUE) {
            byte result = (byte) (++data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to increment.");
        }
    }
    private void processB2G() throws Throwable {
        byte data;
        data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        dataGdB2G = data;
        gB2GSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
