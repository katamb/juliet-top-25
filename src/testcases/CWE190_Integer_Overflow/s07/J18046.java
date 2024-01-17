package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J18046 extends AbstractTestCase {
    private void badSink(long data) throws Throwable {
        long result = (long) (++data);
        IO.writeLine("result: " + result);
    }
    public void handle() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        badSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
