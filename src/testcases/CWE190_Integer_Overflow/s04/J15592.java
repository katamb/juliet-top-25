package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15592 extends AbstractTestCase {
    public void handle() throws Throwable {
        long data;
        if (5 == 5) {
            data = Long.MAX_VALUE;
        } else {
            data = 0L;
        }
        if (5 == 5) {
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
