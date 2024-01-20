package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15940 extends AbstractTestCase {
    public void handle() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        short result = (short) (data + 1);
        IO.writeLine("result: " + result);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
