package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_add_10_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        short data;
        if (IO.staticTrue) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (IO.staticTrue) {
            short result = (short) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
