package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J18070 extends AbstractTestCase {
    public void handle() throws Throwable {
        long data;
        if (IO.staticTrue) {
            data = (new java.security.SecureRandom()).nextLong();
        } else {
            data = 0L;
        }
        if (IO.staticTrue) {
            long result = (long) (++data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
