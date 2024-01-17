package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15706 extends AbstractTestCase {
    public void handle() throws Throwable {
        long data;
        while (true) {
            data = (new java.security.SecureRandom()).nextLong();
            break;
        }
        while (true) {
            long result = (long) (data + 1);
            IO.writeLine("result: " + result);
            break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
