package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_add_45_bad extends AbstractTestCase {
    private short dataBad;
    private short dataGoodG2B;
    private short dataGoodB2G;
    private void badSink() throws Throwable {
        short data = dataBad;
        short result = (short) (data + 1);
        IO.writeLine("result: " + result);
    }
    public void bad() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        dataBad = data;
        badSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
