package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__int_max_multiply_41_bad extends AbstractTestCase {
    private void badSink(int data) throws Throwable {
        if (data > 0)  {
            int result = (int) (data * 2);
            IO.writeLine("result: " + result);
        }
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
