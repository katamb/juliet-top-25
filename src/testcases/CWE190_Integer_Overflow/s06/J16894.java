package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class J16894 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        while (true) {
            data = (new SecureRandom()).nextInt();
            break;
        }
        while (true) {
            data++;
            int result = (int) (data);
            IO.writeLine("result: " + result);
            break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
