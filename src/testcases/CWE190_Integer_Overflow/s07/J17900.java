package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class J17900 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        if (IO.STATIC_FINAL_FIVE == 5) {
            data = (new SecureRandom()).nextInt();
        } else {
            data = 0;
        }
        if (IO.STATIC_FINAL_FIVE == 5) {
            int result = (int) (++data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
