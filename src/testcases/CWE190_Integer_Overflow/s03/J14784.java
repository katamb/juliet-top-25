package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J14784 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        for (int j = 0; j < 1; j++) {
            int result = (int) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
