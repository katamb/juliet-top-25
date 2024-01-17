package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16266 extends AbstractTestCase {
    public void handle() throws Throwable {
        byte data;
        if (IO.staticTrue) {
            data = Byte.MAX_VALUE;
        } else {
            data = 0;
        }
        if (IO.staticTrue) {
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
