package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_max_postinc_06_bad extends AbstractTestCase {
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;
    public void bad() throws Throwable {
        long data;
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data = Long.MAX_VALUE;
        } else {
            data = 0L;
        }
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
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
