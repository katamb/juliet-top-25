package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__int_max_add_13_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        if (IO.STATIC_FINAL_FIVE == 5) {
            data = Integer.MAX_VALUE;
        } else {
            data = 0;
        }
        if (IO.STATIC_FINAL_FIVE == 5) {
            int result = (int) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
