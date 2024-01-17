package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_max_preinc_31_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        byte dataCopy;
        {
            byte data;
            data = Byte.MAX_VALUE;
            dataCopy = data;
        }
        {
            byte data = dataCopy;
            byte result = (byte) (++data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
