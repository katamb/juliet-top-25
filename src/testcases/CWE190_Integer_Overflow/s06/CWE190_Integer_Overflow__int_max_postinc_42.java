package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__int_max_postinc_42 extends AbstractTestCase {
    private int badSource() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        return data;
    }
    public void bad() throws Throwable {
        int data = badSource();
        data++;
        int result = (int) (data);
        IO.writeLine("result: " + result);
    }
    private int goodG2BSource() throws Throwable {
        int data;
        data = 2;
        return data;
    }
    private void goodG2B() throws Throwable {
        int data = goodG2BSource();
        data++;
        int result = (int) (data);
        IO.writeLine("result: " + result);
    }
    private int goodB2GSource() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        return data;
    }
    private void goodB2G() throws Throwable {
        int data = goodB2GSource();
        if (data < Integer.MAX_VALUE) {
            data++;
            int result = (int) (data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to increment.");
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