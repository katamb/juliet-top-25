package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_add_03_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        short data;
        if (5 == 5) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (5 == 5) {
            short result = (short) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
