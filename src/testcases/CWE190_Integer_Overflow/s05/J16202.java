package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16202 extends AbstractTestCase {
    private short dataB;
    private short dataGdG2B;
    private short dataGdB2G;
    private void bS() throws Throwable {
        short data = dataB;
        short result = (short) (data * data);
        IO.writeLine("result: " + result);
    }
    public void handle() throws Throwable {
        short data;
        data = (short) ((new java.security.SecureRandom()).nextInt(1 + Short.MAX_VALUE - Short.MIN_VALUE) + Short.MIN_VALUE);
        dataB = data;
        bS();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
