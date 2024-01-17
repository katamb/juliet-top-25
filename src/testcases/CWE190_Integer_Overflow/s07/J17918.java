package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class J17918 extends AbstractTestCase {
    private int dataB;
    private int dataGdG2B;
    private int dataGdB2G;
    private void badSink() throws Throwable {
        int data = dataB;
        int result = (int) (++data);
        IO.writeLine("result: " + result);
    }
    public void handle() throws Throwable {
        int data;
        data = (new SecureRandom()).nextInt();
        dataB = data;
        badSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
