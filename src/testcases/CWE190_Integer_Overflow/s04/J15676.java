package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15676 extends AbstractTestCase {
    public void handle() throws Throwable {
        long data;
        data = (new java.security.SecureRandom()).nextLong();
        long result = (long) (data + 1);
        IO.writeLine("result: " + result);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
