package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_max_multiply_16_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        long data;
        while (true) {
            data = Long.MAX_VALUE;
            break;
        }
        while (true) {
            if (data > 0)  {
                long result = (long) (data * 2);
                IO.writeLine("result: " + result);
            }
            break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
