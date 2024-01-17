package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__int_max_square_41_bad extends AbstractTestCase {
    private void badSink(int data) throws Throwable {
        int result = (int) (data * data);
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
