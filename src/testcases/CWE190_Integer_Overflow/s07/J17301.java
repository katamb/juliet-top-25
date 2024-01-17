package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17301 extends AbstractTestCase {
    private byte badSource() throws Throwable {
        byte data;
        data = Byte.MAX_VALUE;
        return data;
    }
    private byte processG2BSource() throws Throwable {
        byte data;
        data = 2;
        return data;
    }
    private void processG2B() throws Throwable {
        byte data = processG2BSource();
        byte result = (byte) (++data);
        IO.writeLine("result: " + result);
    }
    private byte processB2GSource() throws Throwable {
        byte data;
        data = Byte.MAX_VALUE;
        return data;
    }
    private void processB2G() throws Throwable {
        byte data = processB2GSource();
        if (data < Byte.MAX_VALUE) {
            byte result = (byte) (++data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to increment.");
        }
    }
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
