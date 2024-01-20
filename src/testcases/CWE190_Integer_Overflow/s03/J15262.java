package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class J15262 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        if (IO.staticFive == 5) {
            data = (new SecureRandom()).nextInt();
        } else {
            data = 0;
        }
        if (IO.staticFive == 5) {
            int result = (int) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
