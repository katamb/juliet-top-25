package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_postinc_07_bad extends AbstractTestCase {
    private int privateFive = 5;
    public void bad() throws Throwable {
        short data;
        if (privateFive == 5) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (privateFive == 5) {
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
