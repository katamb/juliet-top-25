package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J13518 extends AbstractTestCase {
    private byte dataB;
    private byte dataGdG2B;
    private byte dataGdB2G;
    private void badSink() throws Throwable {
        byte data = dataB;
        if (data > 0)  {
            byte result = (byte) (data * 2);
            IO.writeLine("result: " + result);
        }
    }
    public void handle() throws Throwable {
        byte data;
        data = (byte) ((new java.security.SecureRandom()).nextInt(1 + Byte.MAX_VALUE - Byte.MIN_VALUE) + Byte.MIN_VALUE);
        dataB = data;
        badSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
