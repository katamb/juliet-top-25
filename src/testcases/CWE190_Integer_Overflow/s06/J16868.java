package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class J16868 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        if (5 == 5) {
            data = (new SecureRandom()).nextInt();
        } else {
            data = 0;
        }
        if (5 == 5) {
            data++;
            int result = (int) (data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
