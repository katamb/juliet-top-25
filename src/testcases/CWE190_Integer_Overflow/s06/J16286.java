package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16286 extends AbstractTestCase {
    private void bS(byte data) throws Throwable {
        data++;
        byte result = (byte) (data);
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
