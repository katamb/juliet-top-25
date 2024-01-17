package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_rand_add_15_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        long data;
        switch (6) {
            case 6:
                data = (new java.security.SecureRandom()).nextLong();
                break;
            default:
                data = 0L;
                break;
        }
        switch (7) {
            case 7:
                long result = (long) (data + 1);
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
