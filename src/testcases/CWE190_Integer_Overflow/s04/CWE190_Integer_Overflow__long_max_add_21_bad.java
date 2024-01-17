package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_max_add_21_bad extends AbstractTestCase {
    private boolean badPrivate = false;
    public void bad() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        badPrivate = true;
        badSink(data);
    }
    private void badSink(long data) throws Throwable {
        if (badPrivate) {
            long result = (long) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private boolean goodB2G1Private = false;
    private boolean goodB2G2Private = false;
    private boolean goodG2BPrivate = false;
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
