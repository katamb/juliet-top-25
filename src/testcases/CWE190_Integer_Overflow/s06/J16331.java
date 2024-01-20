package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16331 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void gG2BS(byte data) throws Throwable {
        data++;
        byte result = (byte) (data);
        IO.writeLine("result: " + result);
    }
    private void processG2B() throws Throwable {
        byte data;
        data = 2;
        gG2BS(data);
    }
    private void gB2GS(byte data) throws Throwable {
        if (data < Byte.MAX_VALUE) {
            data++;
            byte result = (byte) (data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to increment.");
        }
    }
    private void processB2G() throws Throwable {
        byte data;
        data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        gB2GS(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
