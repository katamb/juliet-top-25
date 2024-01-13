package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J1318 extends AbstractTestCase {
    public void handle() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        data++;
        long result = (long) (data);
        IO.writeLine("result: " + result);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
