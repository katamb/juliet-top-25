package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J14794 extends AbstractTestCase {
    private int dataB;
    private int dataGdG2B;
    private int dataGdB2G;
    private void badSink() throws Throwable {
        int data = dataB;
        int result = (int) (data + 1);
        IO.writeLine("result: " + result);
    }
    public void handle() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        dataB = data;
        badSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
