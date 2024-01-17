package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__int_max_square_16_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        while (true) {
            data = Integer.MAX_VALUE;
            break;
        }
        while (true) {
            int result = (int) (data * data);
            IO.writeLine("result: " + result);
            break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
