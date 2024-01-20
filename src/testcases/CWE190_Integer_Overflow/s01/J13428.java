package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J13428 extends AbstractTestCase {
    private byte bSce() throws Throwable {
        byte data;
        data = Byte.MAX_VALUE;
        return data;
    }
    public void handle() throws Throwable {
        byte data = bSce();
        byte result = (byte) (data * data);
        IO.writeLine("result: " + result);
    }
    private byte processG2BSce() throws Throwable {
        byte data;
        data = 2;
        return data;
    }
    private byte processB2GSce() throws Throwable {
        byte data;
        data = Byte.MAX_VALUE;
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
