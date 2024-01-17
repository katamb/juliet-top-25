package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_max_add_10_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        long data;
        if (IO.staticTrue) {
            data = Long.MAX_VALUE;
        } else {
            data = 0L;
        }
        if (IO.staticTrue) {
            long result = (long) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
