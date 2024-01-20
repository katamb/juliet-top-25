package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class J17898 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = (new SecureRandom()).nextInt();
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            int result = (int) (++data);
            IO.writeLine("result: " + result);
        } else {
            if (data < Integer.MAX_VALUE) {
                int result = (int) (++data);
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
