package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_max_multiply_45_bad extends AbstractTestCase {
    private byte dataBad;
    private byte dataGoodG2B;
    private byte dataGoodB2G;
    private void badSink() throws Throwable {
        byte data = dataBad;
        if (data > 0)  {
            byte result = (byte) (data * 2);
            IO.writeLine("result: " + result);
        }
    }
    public void bad() throws Throwable {
        byte data;
        data = Byte.MAX_VALUE;
        dataBad = data;
        badSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
