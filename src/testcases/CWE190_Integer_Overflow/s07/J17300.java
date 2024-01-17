package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17300 extends AbstractTestCase {
    private byte badSource() throws Throwable {
        byte data;
        data = Byte.MAX_VALUE;
        return data;
    }
    public void handle() throws Throwable {
        byte data = badSource();
        byte result = (byte) (++data);
        IO.writeLine("result: " + result);
    }
    private byte processG2BSource() throws Throwable {
        byte data;
        data = 2;
        return data;
    }
    private byte processB2GSource() throws Throwable {
        byte data;
        data = Byte.MAX_VALUE;
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
