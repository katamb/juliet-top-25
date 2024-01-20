package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15564 extends AbstractTestCase {
    public void handle() throws Throwable {
        long data;
        if (IO.staticReturnsTrue()) {
            data = Long.MAX_VALUE;
        } else {
            data = 0L;
        }
        if (IO.staticReturnsTrue()) {
            long result = (long) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
