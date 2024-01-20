package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J13454 extends AbstractTestCase {
    public void handle() throws Throwable {
        byte data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            byte result = (byte) (data + 1);
            IO.writeLine("result: " + result);
        } else {
            if (data < Byte.MAX_VALUE) {
                byte result = (byte) (data + 1);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform addition.");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
