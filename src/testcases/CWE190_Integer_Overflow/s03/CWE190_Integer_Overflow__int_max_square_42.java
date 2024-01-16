package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE190_Integer_Overflow__int_max_square_42 extends AbstractTestCase {
    private int badSource() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        return data;
    }
    public void bad() throws Throwable {
        int data = badSource();
        int result = (int) (data * data);
        IO.writeLine("result: " + result);
    }
    private int goodG2BSource() throws Throwable {
        int data;
        data = 2;
        return data;
    }
    private void goodG2B() throws Throwable {
        int data = goodG2BSource();
        int result = (int) (data * data);
        IO.writeLine("result: " + result);
    }
    private int goodB2GSource() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        return data;
    }
    private void goodB2G() throws Throwable {
        int data = goodB2GSource();
        if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Integer.MAX_VALUE))) {
            int result = (int) (data * data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to perform squaring.");
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