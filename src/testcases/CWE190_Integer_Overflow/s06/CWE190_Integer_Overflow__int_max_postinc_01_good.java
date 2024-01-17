package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__int_max_postinc_01_good extends AbstractTestCase {
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2B() throws Throwable {
        int data;
        data = 2;
        data++;
        int result = (int) (data);
        IO.writeLine("result: " + result);
    }
    private void goodB2G() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        if (data < Integer.MAX_VALUE) {
            data++;
            int result = (int) (data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to increment.");
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
