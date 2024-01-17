package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17082 extends AbstractTestCase {
    private long dataB;
    private long dataGdG2B;
    private long dataGdB2G;
    private void bS() throws Throwable {
        long data = dataB;
        data++;
        long result = (long) (data);
        IO.writeLine("result: " + result);
    }
    public void handle() throws Throwable {
        long data;
        data = (new java.security.SecureRandom()).nextLong();
        dataB = data;
        bS();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
