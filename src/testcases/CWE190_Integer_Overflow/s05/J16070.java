package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16070 extends AbstractTestCase {
    private short dataB;
    private short dataGdG2B;
    private short dataGdB2G;
    private void badSink() throws Throwable {
        short data = dataB;
        short result = (short) (data * data);
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
