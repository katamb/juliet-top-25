package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_max_square_09_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        byte data;
        if (IO.STATIC_FINAL_TRUE) {
            data = Byte.MAX_VALUE;
        } else {
            data = 0;
        }
        if (IO.STATIC_FINAL_TRUE) {
            byte result = (byte) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
