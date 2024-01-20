package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J18207 extends AbstractTestCase {
    private void processG2B() throws Throwable {
        short data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = 2;
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            short result = (short) (++data);
            IO.writeLine("result: " + result);
        } else {
            short result = (short) (++data);
            IO.writeLine("result: " + result);
        }
    }
    private void processB2G() throws Throwable {
        short data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = (short) ((new java.security.SecureRandom()).nextInt(1 + Short.MAX_VALUE - Short.MIN_VALUE) + Short.MIN_VALUE);
        } else {
            data = (short) ((new java.security.SecureRandom()).nextInt(1 + Short.MAX_VALUE - Short.MIN_VALUE) + Short.MIN_VALUE);
        }
        if (IO.staticReturnsTrueOrFalse()) {
            if (data < Short.MAX_VALUE) {
                short result = (short) (++data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        } else {
            if (data < Short.MAX_VALUE) {
                short result = (short) (++data);
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
