package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_max_add_42_bad extends AbstractTestCase {
    private byte badSource() throws Throwable {
        byte data;
        data = Byte.MAX_VALUE;
        return data;
    }
    public void bad() throws Throwable {
        byte data = badSource();
        byte result = (byte) (data + 1);
        IO.writeLine("result: " + result);
    }
    private byte goodG2BSource() throws Throwable {
        byte data;
        data = 2;
        return data;
    }
    private byte goodB2GSource() throws Throwable {
        byte data;
        data = Byte.MAX_VALUE;
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
