package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16774 extends AbstractTestCase {
    private int dataB;
    private int dataGdG2B;
    private int dataGdB2G;
    private void bS() throws Throwable {
        int data = dataB;
        data++;
        int result = (int) (data);
        IO.writeLine("result: " + result);
    }
    public void handle() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        dataB = data;
        bS();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
