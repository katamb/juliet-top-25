package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_max_postinc_14_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        byte data;
        if (IO.staticFive == 5) {
            data = Byte.MAX_VALUE;
        } else {
            data = 0;
        }
        if (IO.staticFive == 5) {
            data++;
            byte result = (byte) (data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
