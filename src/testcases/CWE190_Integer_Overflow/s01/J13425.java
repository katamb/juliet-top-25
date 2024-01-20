package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J13425 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void processG2B() throws Throwable {
        byte dataCopy;
        {
            byte data;
            data = 2;
            dataCopy = data;
        }
        {
            byte data = dataCopy;
            byte result = (byte) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    private void processB2G() throws Throwable {
        byte dataCopy;
        {
            byte data;
            data = Byte.MAX_VALUE;
            dataCopy = data;
        }
        {
            byte data = dataCopy;
            if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Byte.MAX_VALUE))) {
                byte result = (byte) (data * data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform squaring.");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
