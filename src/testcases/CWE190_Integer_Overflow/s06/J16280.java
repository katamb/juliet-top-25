package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16280 extends AbstractTestCase {
    public void handle() throws Throwable {
        byte data;
        data = Byte.MAX_VALUE;
        for (int j = 0; j < 1; j++) {
            data++;
            byte result = (byte) (data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
