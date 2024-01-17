package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15952 extends AbstractTestCase {
    private int privateFive = 5;
    public void handle() throws Throwable {
        short data;
        if (privateFive == 5) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (privateFive == 5) {
            short result = (short) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
