package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J13362 extends AbstractTestCase {
    public void handle() throws Throwable {
        byte data;
        if (IO.staticTrue) {
            data = Byte.MAX_VALUE;
        } else {
            data = 0;
        }
        if (IO.staticTrue) {
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
