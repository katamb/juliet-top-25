package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16027 extends AbstractTestCase {
    private short dataB;
    private short dataGdG2B;
    private short dataGdB2G;
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void gG2BS() throws Throwable {
        short data = dataGdG2B;
        if (data > 0)  {
            short result = (short) (data * 2);
            IO.writeLine("result: " + result);
        }
    }
    private void processG2B() throws Throwable {
        short data;
        data = 2;
        dataGdG2B = data;
        gG2BS();
    }
    private void gB2GS() throws Throwable {
        short data = dataGdB2G;
        if (data > 0)  {
            if (data < (Short.MAX_VALUE / 2)) {
                short result = (short) (data * 2);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform multiplication.");
            }
        }
    }
    private void processB2G() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        dataGdB2G = data;
        gB2GS();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
