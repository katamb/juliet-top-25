package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17206 extends AbstractTestCase {
    private boolean bPrivate = false;
    public void handle() throws Throwable {
        short data;
        data = (short) ((new java.security.SecureRandom()).nextInt(1 + Short.MAX_VALUE - Short.MIN_VALUE) + Short.MIN_VALUE);
        bPrivate = true;
        bS(data);
    }
    private void bS(short data) throws Throwable {
        if (bPrivate) {
            data++;
            short result = (short) (data);
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
