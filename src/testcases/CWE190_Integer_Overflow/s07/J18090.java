package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J18090 extends AbstractTestCase {
    private void bS(long data) throws Throwable {
        long result = (long) (++data);
        IO.writeLine("result: " + result);
    }
    public void handle() throws Throwable {
        long data;
        data = (new java.security.SecureRandom()).nextLong();
        bS(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
