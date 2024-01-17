package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__long_max_multiply_45_good extends AbstractTestCase {
    private long dataBad;
    private long dataGoodG2B;
    private long dataGoodB2G;
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2BSink() throws Throwable {
        long data = dataGoodG2B;
        if (data > 0)  {
            long result = (long) (data * 2);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B() throws Throwable {
        long data;
        data = 2;
        dataGoodG2B = data;
        goodG2BSink();
    }
    private void goodB2GSink() throws Throwable {
        long data = dataGoodB2G;
        if (data > 0)  {
            if (data < (Long.MAX_VALUE / 2)) {
                long result = (long) (data * 2);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform multiplication.");
            }
        }
    }
    private void goodB2G() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        dataGoodB2G = data;
        goodB2GSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
