package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class CWE190_Integer_Overflow__int_random_postinc_12_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = (new SecureRandom()).nextInt();
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            data++;
            int result = (int) (data);
            IO.writeLine("result: " + result);
        } else {
            if (data < Integer.MAX_VALUE) {
                data++;
                int result = (int) (data);
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
