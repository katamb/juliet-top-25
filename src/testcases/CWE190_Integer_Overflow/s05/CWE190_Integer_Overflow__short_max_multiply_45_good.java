package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_multiply_45_good extends AbstractTestCase {
    private short dataBad;
    private short dataGoodG2B;
    private short dataGoodB2G;
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2BSink() throws Throwable {
        short data = dataGoodG2B;
        if (data > 0)  {
            short result = (short) (data * 2);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B() throws Throwable {
        short data;
        data = 2;
        dataGoodG2B = data;
        goodG2BSink();
    }
    private void goodB2GSink() throws Throwable {
        short data = dataGoodB2G;
        if (data > 0)  {
            if (data < (Short.MAX_VALUE / 2)) {
                short result = (short) (data * 2);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform multiplication.");
            }
        }
    }
    private void goodB2G() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        dataGoodB2G = data;
        goodB2GSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
