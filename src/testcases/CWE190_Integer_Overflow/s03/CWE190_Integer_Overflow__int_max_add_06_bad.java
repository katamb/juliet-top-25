package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__int_max_add_06_bad extends AbstractTestCase {
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;
    public void bad() throws Throwable {
        int data;
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data = Integer.MAX_VALUE;
        } else {
            data = 0;
        }
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            int result = (int) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
