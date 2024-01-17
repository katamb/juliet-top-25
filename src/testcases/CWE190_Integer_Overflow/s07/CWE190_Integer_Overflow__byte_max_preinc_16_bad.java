package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_max_preinc_16_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        byte data;
        while (true) {
            data = Byte.MAX_VALUE;
            break;
        }
        while (true) {
            byte result = (byte) (++data);
            IO.writeLine("result: " + result);
            break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
