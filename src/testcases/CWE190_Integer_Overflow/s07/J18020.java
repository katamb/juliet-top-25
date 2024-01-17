package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J18020 extends AbstractTestCase {
    private int privateFive = 5;
    public void handle() throws Throwable {
        long data;
        if (privateFive == 5) {
            data = Long.MAX_VALUE;
        } else {
            data = 0L;
        }
        if (privateFive == 5) {
            long result = (long) (++data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
