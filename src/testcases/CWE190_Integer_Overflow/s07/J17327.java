package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17327 extends AbstractTestCase {
    private void processG2B() throws Throwable {
        byte data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = 2;
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            byte result = (byte) (++data);
            IO.writeLine("result: " + result);
        } else {
            byte result = (byte) (++data);
            IO.writeLine("result: " + result);
        }
    }
    private void processB2G() throws Throwable {
        byte data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        } else {
            data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        }
        if (IO.staticReturnsTrueOrFalse()) {
            if (data < Byte.MAX_VALUE) {
                byte result = (byte) (++data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        } else {
            if (data < Byte.MAX_VALUE) {
                byte result = (byte) (++data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
