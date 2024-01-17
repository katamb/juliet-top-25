package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J14844 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        if (5 == 5) {
            data = Integer.MAX_VALUE;
        } else {
            data = 0;
        }
        if (5 == 5) {
            int result = (int) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
