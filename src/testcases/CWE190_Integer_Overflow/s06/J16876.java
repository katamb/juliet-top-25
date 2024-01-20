package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class J16876 extends AbstractTestCase {
    private int privateFive = 5;
    public void handle() throws Throwable {
        int data;
        if (privateFive == 5) {
            data = (new SecureRandom()).nextInt();
        } else {
            data = 0;
        }
        if (privateFive == 5) {
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
