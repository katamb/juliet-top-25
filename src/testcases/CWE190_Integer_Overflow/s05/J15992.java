package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15992 extends AbstractTestCase {
    private boolean privateTrue = true;
    private boolean privateFalse = false;
    public void handle() throws Throwable {
        short data;
        if (privateTrue) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (privateTrue) {
            if (data > 0)  {
                short result = (short) (data * 2);
                IO.writeLine("result: " + result);
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
