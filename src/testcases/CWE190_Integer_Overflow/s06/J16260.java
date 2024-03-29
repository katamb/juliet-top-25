package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16260 extends AbstractTestCase {
    private int privateFive = 5;
    public void handle() throws Throwable {
        byte data;
        if (privateFive == 5) {
            data = Byte.MAX_VALUE;
        } else {
            data = 0;
        }
        if (privateFive == 5) {
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
