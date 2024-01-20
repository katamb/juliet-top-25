package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J13554 extends AbstractTestCase {
    private boolean bPrivate = false;
    public void handle() throws Throwable {
        byte data;
        data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        bPrivate = true;
        bS(data);
    }
    private void bS(byte data) throws Throwable {
        if (bPrivate) {
            byte result = (byte) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    private boolean gB2G1Private = false;
    private boolean gB2G2Private = false;
    private boolean gG2BPrivate = false;
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
