package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J1324 extends AbstractTestCase {
    public void handle() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        data++;
        short result = (short) (data);
        IO.writeLine("result: " + result);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
