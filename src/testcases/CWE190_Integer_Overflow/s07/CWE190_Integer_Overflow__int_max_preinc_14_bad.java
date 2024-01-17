package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__int_max_preinc_14_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        if (IO.staticFive == 5) {
            data = Integer.MAX_VALUE;
        } else {
            data = 0;
        }
        if (IO.staticFive == 5) {
            int result = (int) (++data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
