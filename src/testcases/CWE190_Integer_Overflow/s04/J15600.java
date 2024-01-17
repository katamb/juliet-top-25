package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15600 extends AbstractTestCase {
    private int privateFive = 5;
    public void handle() throws Throwable {
        long data;
        if (privateFive == 5) {
            data = Long.MAX_VALUE;
        } else {
            data = 0L;
        }
        if (privateFive == 5) {
            if (data > 0)  {
                long result = (long) (data * 2);
                IO.writeLine("result: " + result);
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
