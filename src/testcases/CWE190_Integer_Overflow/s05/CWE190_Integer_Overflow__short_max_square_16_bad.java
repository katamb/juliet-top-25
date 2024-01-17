package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_square_16_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        short data;
        while (true) {
            data = Short.MAX_VALUE;
            break;
        }
        while (true) {
            short result = (short) (data * data);
            IO.writeLine("result: " + result);
            break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
