package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_max_preinc_02_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        long data;
        if (true) {
            data = Long.MAX_VALUE;
        } else {
            data = 0L;
        }
        if (true) {
            long result = (long) (++data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
