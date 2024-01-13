package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J1256 extends AbstractTestCase {
    public void handle() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        long result = (long) (data * data);
        IO.writeLine("result: " + result);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
