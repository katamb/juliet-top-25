package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17744 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        int result = (int) (++data);
        IO.writeLine("result: " + result);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
