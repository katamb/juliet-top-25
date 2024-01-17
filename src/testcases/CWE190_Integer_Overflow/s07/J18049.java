package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J18049 extends AbstractTestCase {
    private long bSce() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        return data;
    }
    private long processG2BSce() throws Throwable {
        long data;
        data = 2;
        return data;
    }
    private void processG2B() throws Throwable {
        long data = processG2BSce();
        long result = (long) (++data);
        IO.writeLine("result: " + result);
    }
    private long processB2GSce() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        return data;
    }
    private void processB2G() throws Throwable {
        long data = processB2GSce();
        if (data < Long.MAX_VALUE) {
            long result = (long) (++data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to increment.");
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
