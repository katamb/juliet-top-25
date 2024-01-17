package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15981 extends AbstractTestCase {
    private short badSource() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        return data;
    }
    private short processG2BSource() throws Throwable {
        short data;
        data = 2;
        return data;
    }
    private void processG2B() throws Throwable {
        short data = processG2BSource();
        short result = (short) (data + 1);
        IO.writeLine("result: " + result);
    }
    private short processB2GSource() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        return data;
    }
    private void processB2G() throws Throwable {
        short data = processB2GSource();
        if (data < Short.MAX_VALUE) {
            short result = (short) (data + 1);
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
