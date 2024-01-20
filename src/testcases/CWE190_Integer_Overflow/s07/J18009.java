package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J18009 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void processG2B() throws Throwable {
        long data;
        data = 2;
        long result = (long) (++data);
        IO.writeLine("result: " + result);
    }
    private void processB2G() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        if (data < Long.MAX_VALUE) {
            long result = (long) (++data);
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
