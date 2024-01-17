package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J14881 extends AbstractTestCase {
    private int badSource() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        return data;
    }
    private int processG2BSource() throws Throwable {
        int data;
        data = 2;
        return data;
    }
    private void processG2B() throws Throwable {
        int data = processG2BSource();
        int result = (int) (data * data);
        IO.writeLine("result: " + result);
    }
    private int processB2GSource() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        return data;
    }
    private void processB2G() throws Throwable {
        int data = processB2GSource();
        if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Integer.MAX_VALUE))) {
            int result = (int) (data * data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to perform squaring.");
        }
    }
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
