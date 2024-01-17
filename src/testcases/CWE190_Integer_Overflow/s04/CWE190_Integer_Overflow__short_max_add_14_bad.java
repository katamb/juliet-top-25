package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_add_14_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        short data;
        if (IO.staticFive == 5) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (IO.staticFive == 5) {
            short result = (short) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
