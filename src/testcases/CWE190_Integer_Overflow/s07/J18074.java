package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J18074 extends AbstractTestCase {
    public void handle() throws Throwable {
        long data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = (new java.security.SecureRandom()).nextLong();
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            long result = (long) (++data);
            IO.writeLine("result: " + result);
        } else {
            if (data < Long.MAX_VALUE) {
                long result = (long) (++data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
