package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_max_add_45_bad extends AbstractTestCase {
    private long dataBad;
    private long dataGoodG2B;
    private long dataGoodB2G;
    private void badSink() throws Throwable {
        long data = dataBad;
        long result = (long) (data + 1);
        IO.writeLine("result: " + result);
    }
    public void bad() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        dataBad = data;
        badSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
