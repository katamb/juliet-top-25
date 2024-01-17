package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J13560 extends AbstractTestCase {
    private byte badSource() throws Throwable {
        byte data;
        data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        return data;
    }
    public void handle() throws Throwable {
        byte data = badSource();
        byte result = (byte) (data * data);
        IO.writeLine("result: " + result);
    }
    private byte processG2BSource() throws Throwable {
        byte data;
        data = 2;
        return data;
    }
    private byte processB2GSource() throws Throwable {
        byte data;
        data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
