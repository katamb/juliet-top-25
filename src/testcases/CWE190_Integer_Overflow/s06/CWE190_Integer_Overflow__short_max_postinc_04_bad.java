package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_postinc_04_bad extends AbstractTestCase {
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;
    public void bad() throws Throwable {
        short data;
        if (PRIVATE_STATIC_FINAL_TRUE) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (PRIVATE_STATIC_FINAL_TRUE) {
            data++;
            short result = (short) (data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
