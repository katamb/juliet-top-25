package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_max_preinc_03_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        byte data;
        if (5 == 5) {
            data = Byte.MAX_VALUE;
        } else {
            data = 0;
        }
        if (5 == 5) {
            byte result = (byte) (++data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
