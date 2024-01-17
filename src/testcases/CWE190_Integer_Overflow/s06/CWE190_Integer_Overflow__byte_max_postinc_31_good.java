package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_max_postinc_31_good extends AbstractTestCase {
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2B() throws Throwable {
        byte dataCopy;
        {
            byte data;
            data = 2;
            dataCopy = data;
        }
        {
            byte data = dataCopy;
            data++;
            byte result = (byte) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G() throws Throwable {
        byte dataCopy;
        {
            byte data;
            data = Byte.MAX_VALUE;
            dataCopy = data;
        }
        {
            byte data = dataCopy;
            if (data < Byte.MAX_VALUE) {
                data++;
                byte result = (byte) (data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
