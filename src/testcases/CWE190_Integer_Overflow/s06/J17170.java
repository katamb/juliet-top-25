package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17170 extends AbstractTestCase {
    private short dataB;
    private short dataGdG2B;
    private short dataGdB2G;
    private void badSink() throws Throwable {
        short data = dataB;
        data++;
        short result = (short) (data);
        IO.writeLine("result: " + result);
    }
    public void handle() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        dataB = data;
        badSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
