package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__int_max_multiply_09_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        if (IO.STATIC_FINAL_TRUE) {
            data = Integer.MAX_VALUE;
        } else {
            data = 0;
        }
        if (IO.STATIC_FINAL_TRUE) {
            if (data > 0)  {
                int result = (int) (data * 2);
                IO.writeLine("result: " + result);
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
