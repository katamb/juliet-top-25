package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J13300 extends AbstractTestCase {
    public void handle() throws Throwable {
        byte data;
        data = Byte.MAX_VALUE;
        byte result = (byte) (data + 1);
        IO.writeLine("result: " + result);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
