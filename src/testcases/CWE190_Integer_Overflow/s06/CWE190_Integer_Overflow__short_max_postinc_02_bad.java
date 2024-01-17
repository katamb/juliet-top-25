package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_postinc_02_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        short data;
        if (true) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (true) {
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
