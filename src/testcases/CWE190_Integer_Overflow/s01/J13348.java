package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J13348 extends AbstractTestCase {
    public void handle() throws Throwable {
        byte data;
        if (5 == 5) {
            data = Byte.MAX_VALUE;
        } else {
            data = 0;
        }
        if (5 == 5) {
            if (data > 0)  {
                byte result = (byte) (data * 2);
                IO.writeLine("result: " + result);
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
