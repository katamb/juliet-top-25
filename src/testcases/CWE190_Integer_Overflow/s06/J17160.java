package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17160 extends AbstractTestCase {
    public void handle() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        for (int j = 0; j < 1; j++) {
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
