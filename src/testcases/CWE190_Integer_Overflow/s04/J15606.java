package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15606 extends AbstractTestCase {
    public void handle() throws Throwable {
        long data;
        if (IO.staticTrue) {
            data = Long.MAX_VALUE;
        } else {
            data = 0L;
        }
        if (IO.staticTrue) {
            if (data > 0)  {
                long result = (long) (data * 2);
                IO.writeLine("result: " + result);
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
