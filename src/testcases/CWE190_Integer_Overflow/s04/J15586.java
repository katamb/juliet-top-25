package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15586 extends AbstractTestCase {
    private long dataB;
    private long dataGdG2B;
    private long dataGdB2G;
    private void bS() throws Throwable {
        long data = dataB;
        long result = (long) (data + 1);
        IO.writeLine("result: " + result);
    }
    public void handle() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        dataB = data;
        bS();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
