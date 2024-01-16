package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__int_max_preinc_17 extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        for (int j = 0; j < 1; j++) {
            int result = (int) (++data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B() throws Throwable {
        int data;
        data = 2;
        for (int j = 0; j < 1; j++) {
            int result = (int) (++data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        for (int k = 0; k < 1; k++) {
            if (data < Integer.MAX_VALUE) {
                int result = (int) (++data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}