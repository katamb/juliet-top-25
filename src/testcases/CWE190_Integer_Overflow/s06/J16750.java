package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16750 extends AbstractTestCase {
    public void handle() throws Throwable {
        int data;
        if (IO.staticTrue) {
            data = Integer.MAX_VALUE;
        } else {
            data = 0;
        }
        if (IO.staticTrue) {
            data++;
            int result = (int) (data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
