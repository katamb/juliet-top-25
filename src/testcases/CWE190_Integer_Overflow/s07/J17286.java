package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17286 extends AbstractTestCase {
    public void handle() throws Throwable {
        byte data;
        if (IO.staticFive == 5) {
            data = Byte.MAX_VALUE;
        } else {
            data = 0;
        }
        if (IO.staticFive == 5) {
            byte result = (byte) (++data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
