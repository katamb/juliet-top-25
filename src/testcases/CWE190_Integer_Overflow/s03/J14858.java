package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J14858 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        if (IO.staticTrue) {
            data = Integer.MAX_VALUE;
        } else {
            data = 0;
        }
        if (IO.staticTrue) {
            int result = (int) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
