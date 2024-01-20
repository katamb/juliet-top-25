package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15982 extends AbstractTestCase {
    private short dataB;
    private short dataGdG2B;
    private short dataGdB2G;
    private void bS() throws Throwable {
        short data = dataB;
        short result = (short) (data + 1);
        IO.writeLine("result: " + result);
    }
    public void handle() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        dataB = data;
        bS();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
