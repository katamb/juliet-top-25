package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15638 extends AbstractTestCase {
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;
    public void handle() throws Throwable {
        long data;
        if (PRIVATE_STATIC_FINAL_TRUE) {
            data = Long.MAX_VALUE;
        } else {
            data = 0L;
        }
        if (PRIVATE_STATIC_FINAL_TRUE) {
            long result = (long) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
