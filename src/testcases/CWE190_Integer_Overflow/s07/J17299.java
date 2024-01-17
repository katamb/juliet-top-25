package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17299 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void gG2BSink(byte data) throws Throwable {
        byte result = (byte) (++data);
        IO.writeLine("result: " + result);
    }
    private void processG2B() throws Throwable {
        byte data;
        data = 2;
        gG2BSink(data);
    }
    private void gB2GSink(byte data) throws Throwable {
        if (data < Byte.MAX_VALUE) {
            byte result = (byte) (++data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to increment.");
        }
    }
    private void processB2G() throws Throwable {
        byte data;
        data = Byte.MAX_VALUE;
        gB2GSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
