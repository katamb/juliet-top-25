package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__short_max_multiply_12_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        short data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = Short.MAX_VALUE;
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            if (data > 0)  {
                short result = (short) (data * 2);
                IO.writeLine("result: " + result);
            }
        } else {
            if (data > 0)  {
                if (data < (Short.MAX_VALUE / 2)) {
                    short result = (short) (data * 2);
                    IO.writeLine("result: " + result);
                } else {
                    IO.writeLine("data value is too large to perform multiplication.");
                }
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
