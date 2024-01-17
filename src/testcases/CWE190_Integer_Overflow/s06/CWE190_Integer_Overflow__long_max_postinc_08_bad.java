package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_max_postinc_08_bad extends AbstractTestCase {
    private boolean privateReturnsTrue() {
        return true;
    }
    private boolean privateReturnsFalse() {
        return false;
    }
    public void bad() throws Throwable {
        long data;
        if (privateReturnsTrue()) {
            data = Long.MAX_VALUE;
        } else {
            data = 0L;
        }
        if (privateReturnsTrue()) {
            data++;
            long result = (long) (data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
