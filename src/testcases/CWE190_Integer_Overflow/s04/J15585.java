package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15585 extends AbstractTestCase {
    private long badSource() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        return data;
    }
    private long processG2BSource() throws Throwable {
        long data;
        data = 2;
        return data;
    }
    private void processG2B() throws Throwable {
        long data = processG2BSource();
        long result = (long) (data + 1);
        IO.writeLine("result: " + result);
    }
    private long processB2GSource() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        return data;
    }
    private void processB2G() throws Throwable {
        long data = processB2GSource();
        if (data < Long.MAX_VALUE) {
            long result = (long) (data + 1);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to perform addition.");
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
