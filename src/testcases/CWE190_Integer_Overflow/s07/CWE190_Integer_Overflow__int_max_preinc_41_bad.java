package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__int_max_preinc_41_bad extends AbstractTestCase {
    private void badSink(int data) throws Throwable {
        int result = (int) (++data);
        IO.writeLine("result: " + result);
    }
    public void bad() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        badSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
