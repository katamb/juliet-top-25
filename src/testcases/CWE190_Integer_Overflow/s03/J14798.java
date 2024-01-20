package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J14798 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        if (true) {
            data = Integer.MAX_VALUE;
        } else {
            data = 0;
        }
        if (true) {
            if (data > 0)  {
                int result = (int) (data * 2);
                IO.writeLine("result: " + result);
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
