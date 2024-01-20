package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17752 extends AbstractTestCase {
    private boolean privateTrue = true;
    private boolean privateFalse = false;
    public void handle() throws Throwable {
        int data;
        if (privateTrue) {
            data = Integer.MAX_VALUE;
        } else {
            data = 0;
        }
        if (privateTrue) {
            int result = (int) (++data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
