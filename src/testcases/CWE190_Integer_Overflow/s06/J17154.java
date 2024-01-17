package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17154 extends AbstractTestCase {
    public void handle() throws Throwable {
        short data;
        if (IO.staticFive == 5) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (IO.staticFive == 5) {
            data++;
            short result = (short) (data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
