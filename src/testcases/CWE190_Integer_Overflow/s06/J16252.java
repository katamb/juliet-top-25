package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16252 extends AbstractTestCase {
    public void handle() throws Throwable {
        byte data;
        if (5 == 5) {
            data = Byte.MAX_VALUE;
        } else {
            data = 0;
        }
        if (5 == 5) {
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
