package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17072 extends AbstractTestCase {
    public void handle() throws Throwable {
        long data;
        data = (new java.security.SecureRandom()).nextLong();
        for (int j = 0; j < 1; j++) {
            data++;
            long result = (long) (data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
