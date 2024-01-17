package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class J15264 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        switch (6) {
            case 6:
                data = (new SecureRandom()).nextInt();
                break;
            default:
                data = 0;
                break;
        }
        switch (7) {
            case 7:
                int result = (int) (data * data);
                IO.writeLine("result: " + result);
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
