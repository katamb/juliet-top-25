package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15983 extends AbstractTestCase {
    private short dataB;
    private short dataGdG2B;
    private short dataGdB2G;
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void gG2BSink() throws Throwable {
        short data = dataGdG2B;
        short result = (short) (data + 1);
        IO.writeLine("result: " + result);
    }
    private void processG2B() throws Throwable {
        short data;
        data = 2;
        dataGdG2B = data;
        gG2BSink();
    }
    private void gB2GSink() throws Throwable {
        short data = dataGdB2G;
        if (data < Short.MAX_VALUE) {
            short result = (short) (data + 1);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to perform addition.");
        }
    }
    private void processB2G() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        dataGdB2G = data;
        gB2GSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
