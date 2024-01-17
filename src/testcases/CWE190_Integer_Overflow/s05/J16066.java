package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16066 extends AbstractTestCase {
    private void badSink(short data) throws Throwable {
        short result = (short) (data * data);
        IO.writeLine("result: " + result);
    }
    public void handle() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        badSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
