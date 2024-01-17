package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15762 extends AbstractTestCase {
    private long dataB;
    private long dataGdG2B;
    private long dataGdB2G;
    private void badSink() throws Throwable {
        long data = dataB;
        if (data > 0)  {
            long result = (long) (data * 2);
            IO.writeLine("result: " + result);
        }
    }
    public void handle() throws Throwable {
        long data;
        data = (new java.security.SecureRandom()).nextLong();
        dataB = data;
        badSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
