package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17296 extends AbstractTestCase {
    public void handle() throws Throwable {
        byte dataCopy;
        {
            byte data;
            data = Byte.MAX_VALUE;
            dataCopy = data;
        }
        {
            byte data = dataCopy;
            byte result = (byte) (++data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
