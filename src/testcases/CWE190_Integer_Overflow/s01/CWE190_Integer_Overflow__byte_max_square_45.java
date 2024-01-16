package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_max_square_45 extends AbstractTestCase {
    private byte dataBad;
    private byte dataGoodG2B;
    private byte dataGoodB2G;
    private void badSink() throws Throwable {
        byte data = dataBad;
        byte result = (byte) (data * data);
        IO.writeLine("result: " + result);
    }
    public void bad() throws Throwable {
        byte data;
        data = Byte.MAX_VALUE;
        dataBad = data;
        badSink();
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2BSink() throws Throwable {
        byte data = dataGoodG2B;
        byte result = (byte) (data * data);
        IO.writeLine("result: " + result);
    }
    private void goodG2B() throws Throwable {
        byte data;
        data = 2;
        dataGoodG2B = data;
        goodG2BSink();
    }
    private void goodB2GSink() throws Throwable {
        byte data = dataGoodB2G;
        if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Byte.MAX_VALUE))) {
            byte result = (byte) (data * data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to perform squaring.");
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