package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_max_postinc_02_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        byte data;
        if (true) {
            data = Byte.MAX_VALUE;
        } else {
            data = 0;
        }
        if (true) {
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
