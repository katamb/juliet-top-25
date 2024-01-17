package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_max_postinc_41_bad extends AbstractTestCase {
    private void badSink(byte data) throws Throwable {
        data++;
        byte result = (byte) (data);
        IO.writeLine("result: " + result);
    }
    public void bad() throws Throwable {
        byte data;
        data = Byte.MAX_VALUE;
        badSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
