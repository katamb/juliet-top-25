package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__byte_max_postinc_12_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        byte data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = Byte.MAX_VALUE;
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            data++;
            byte result = (byte) (data);
            IO.writeLine("result: " + result);
        } else {
            if (data < Byte.MAX_VALUE) {
                data++;
                byte result = (byte) (data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
