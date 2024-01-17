package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__int_max_square_31_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        int dataCopy;
        {
            int data;
            data = Integer.MAX_VALUE;
            dataCopy = data;
        }
        {
            int data = dataCopy;
            int result = (int) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
