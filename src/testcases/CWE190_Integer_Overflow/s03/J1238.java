package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class J1238 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        data = (new SecureRandom()).nextInt();
        int result = (int) (data * data);
        IO.writeLine("result: " + result);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
