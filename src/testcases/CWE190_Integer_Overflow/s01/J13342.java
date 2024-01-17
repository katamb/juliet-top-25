package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J13342 extends AbstractTestCase {
    private byte dataB;
    private byte dataGdG2B;
    private byte dataGdB2G;
    private void badSink() throws Throwable {
        byte data = dataB;
        byte result = (byte) (data + 1);
        IO.writeLine("result: " + result);
    }
    public void handle() throws Throwable {
        byte data;
        data = Byte.MAX_VALUE;
        dataB = data;
        badSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
