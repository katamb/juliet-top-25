package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17782 extends AbstractTestCase {
    private void bS(int data) throws Throwable {
        int result = (int) (++data);
        IO.writeLine("result: " + result);
    }
    public void handle() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        bS(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
