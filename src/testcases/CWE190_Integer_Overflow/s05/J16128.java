package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16128 extends AbstractTestCase {
    private int privateFive = 5;
    public void handle() throws Throwable {
        short data;
        if (privateFive == 5) {
            data = (short) ((new java.security.SecureRandom()).nextInt(1 + Short.MAX_VALUE - Short.MIN_VALUE) + Short.MIN_VALUE);
        } else {
            data = 0;
        }
        if (privateFive == 5) {
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
