package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16768 extends AbstractTestCase {
    public void handle() throws Throwable {
        int dataCopy;
        {
            int data;
            data = Integer.MAX_VALUE;
            dataCopy = data;
        }
        {
            int data = dataCopy;
            data++;
            int result = (int) (data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
