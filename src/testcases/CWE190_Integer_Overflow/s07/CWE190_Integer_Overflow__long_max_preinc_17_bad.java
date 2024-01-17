package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_max_preinc_17_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        for (int j = 0; j < 1; j++) {
            long result = (long) (++data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
