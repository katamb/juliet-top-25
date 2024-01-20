package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J14788 extends AbstractTestCase {
    public void handle() throws Throwable {
        int dataCopy;
        {
            int data;
            data = Integer.MAX_VALUE;
            dataCopy = data;
        }
        {
            int data = dataCopy;
            int result = (int) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
