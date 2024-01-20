package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16248 extends AbstractTestCase {
    public void handle() throws Throwable {
        byte data;
        data = Byte.MAX_VALUE;
        data++;
        byte result = (byte) (data);
        IO.writeLine("result: " + result);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
