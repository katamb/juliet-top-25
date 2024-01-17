package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__int_max_multiply_07_bad extends AbstractTestCase {
    private int privateFive = 5;
    public void bad() throws Throwable {
        int data;
        if (privateFive == 5) {
            data = Integer.MAX_VALUE;
        } else {
            data = 0;
        }
        if (privateFive == 5) {
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
