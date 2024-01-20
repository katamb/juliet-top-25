package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J13338 extends AbstractTestCase {
    private void bS(byte data) throws Throwable {
        byte result = (byte) (data + 1);
        IO.writeLine("result: " + result);
    }
    public void handle() throws Throwable {
        byte data;
        data = Byte.MAX_VALUE;
        bS(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
