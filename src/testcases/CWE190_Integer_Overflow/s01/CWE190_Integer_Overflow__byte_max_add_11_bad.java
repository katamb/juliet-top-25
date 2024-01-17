package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_max_add_11_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        byte data;
        if (IO.staticReturnsTrue()) {
            data = Byte.MAX_VALUE;
        } else {
            data = 0;
        }
        if (IO.staticReturnsTrue()) {
            byte result = (byte) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
