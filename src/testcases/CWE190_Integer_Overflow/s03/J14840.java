package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J14840 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        int result = (int) (data * data);
        IO.writeLine("result: " + result);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
