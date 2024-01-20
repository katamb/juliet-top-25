package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16291 extends AbstractTestCase {
    private byte dataB;
    private byte dataGdG2B;
    private byte dataGdB2G;
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void gG2BS() throws Throwable {
        byte data = dataGdG2B;
        data++;
        byte result = (byte) (data);
        IO.writeLine("result: " + result);
    }
    private void processG2B() throws Throwable {
        byte data;
        data = 2;
        dataGdG2B = data;
        gG2BS();
    }
    private void gB2GS() throws Throwable {
        byte data = dataGdB2G;
        if (data < Byte.MAX_VALUE) {
            data++;
            byte result = (byte) (data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to increment.");
        }
    }
    private void processB2G() throws Throwable {
        byte data;
        data = Byte.MAX_VALUE;
        dataGdB2G = data;
        gB2GS();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
