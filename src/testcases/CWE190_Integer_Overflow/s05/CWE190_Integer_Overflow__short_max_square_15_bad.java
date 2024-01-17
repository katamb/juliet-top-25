package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_square_15_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        short data;
        switch (6) {
            case 6:
                data = Short.MAX_VALUE;
                break;
            default:
                data = 0;
                break;
        }
        switch (7) {
            case 7:
                short result = (short) (data * data);
                IO.writeLine("result: " + result);
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
