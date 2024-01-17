package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__int_max_postinc_17_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        for (int j = 0; j < 1; j++) {
            data++;
            int result = (int) (data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
