package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__int_max_preinc_45_bad extends AbstractTestCase {
    private int dataBad;
    private int dataGoodG2B;
    private int dataGoodB2G;
    private void badSink() throws Throwable {
        int data = dataBad;
        int result = (int) (++data);
        IO.writeLine("result: " + result);
    }
    public void bad() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        dataBad = data;
        badSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
