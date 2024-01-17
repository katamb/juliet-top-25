package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_square_05_bad extends AbstractTestCase {
    private boolean privateTrue = true;
    private boolean privateFalse = false;
    public void bad() throws Throwable {
        short data;
        if (privateTrue) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (privateTrue) {
            short result = (short) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
