package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_multiply_11_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        short data;
        if (IO.staticReturnsTrue()) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (IO.staticReturnsTrue()) {
            if (data > 0)  {
                short result = (short) (data * 2);
                IO.writeLine("result: " + result);
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
