package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__int_max_postinc_21_bad extends AbstractTestCase {
    private boolean badPrivate = false;
    public void bad() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        badPrivate = true;
        badSink(data);
    }
    private void badSink(int data) throws Throwable {
        if (badPrivate) {
            data++;
            int result = (int) (data);
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
