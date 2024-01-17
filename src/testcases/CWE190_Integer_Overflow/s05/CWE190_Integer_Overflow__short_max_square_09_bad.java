package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_square_09_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        short data;
        if (IO.STATIC_FINAL_TRUE) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (IO.STATIC_FINAL_TRUE) {
            short result = (short) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
