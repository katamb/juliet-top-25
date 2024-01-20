package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class J15266 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        while (true) {
            data = (new SecureRandom()).nextInt();
            break;
        }
        while (true) {
            int result = (int) (data * data);
            IO.writeLine("result: " + result);
            break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
