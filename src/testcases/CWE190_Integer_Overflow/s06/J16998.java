package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16998 extends AbstractTestCase {
    public void handle() throws Throwable {
        long data;
        if (true) {
            data = Long.MAX_VALUE;
        } else {
            data = 0L;
        }
        if (true) {
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
