package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17152 extends AbstractTestCase {
    public void handle() throws Throwable {
        short data;
        if (IO.STATIC_FINAL_FIVE == 5) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (IO.STATIC_FINAL_FIVE == 5) {
            data++;
            short result = (short) (data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
