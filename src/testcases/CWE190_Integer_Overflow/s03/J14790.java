package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J14790 extends AbstractTestCase {
    private void bS(int data) throws Throwable {
        int result = (int) (data + 1);
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
