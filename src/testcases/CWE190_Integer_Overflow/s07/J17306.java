package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17306 extends AbstractTestCase {
    public void handle() throws Throwable {
        byte data;
        if (true) {
            data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        } else {
            data = 0;
        }
        if (true) {
            byte result = (byte) (++data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
