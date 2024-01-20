package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J13563 extends AbstractTestCase {
    private byte dataB;
    private byte dataGdG2B;
    private byte dataGdB2G;
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void gG2BS() throws Throwable {
        byte data = dataGdG2B;
        byte result = (byte) (data * data);
        IO.writeLine("result: " + result);
    }
    private void processG2B() throws Throwable {
        byte data;
        data = 2;
        dataGdG2B = data;
        gG2BS();
    }
    private void gB2GS() throws Throwable {
        byte data = dataGdB2G;
        if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Byte.MAX_VALUE))) {
            byte result = (byte) (data * data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to perform squaring.");
        }
    }
    private void processB2G() throws Throwable {
        byte data;
        data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        dataGdB2G = data;
        gB2GS();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
