package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_max_multiply_45_good extends AbstractTestCase {
    private byte dataBad;
    private byte dataGoodG2B;
    private byte dataGoodB2G;
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2BSink() throws Throwable {
        byte data = dataGoodG2B;
        if (data > 0)  {
            byte result = (byte) (data * 2);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B() throws Throwable {
        byte data;
        data = 2;
        dataGoodG2B = data;
        goodG2BSink();
    }
    private void goodB2GSink() throws Throwable {
        byte data = dataGoodB2G;
        if (data > 0)  {
            if (data < (Byte.MAX_VALUE / 2)) {
                byte result = (byte) (data * 2);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform multiplication.");
            }
        }
    }
    private void goodB2G() throws Throwable {
        byte data;
        data = Byte.MAX_VALUE;
        dataGoodB2G = data;
        goodB2GSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
