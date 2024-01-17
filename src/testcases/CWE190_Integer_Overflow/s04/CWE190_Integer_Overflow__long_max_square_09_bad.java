package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_max_square_09_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        long data;
        if (IO.STATIC_FINAL_TRUE) {
            data = Long.MAX_VALUE;
        } else {
            data = 0L;
        }
        if (IO.STATIC_FINAL_TRUE) {
            long result = (long) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
