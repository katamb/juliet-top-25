package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15979 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void goodG2BSink(short data) throws Throwable {
        short result = (short) (data + 1);
        IO.writeLine("result: " + result);
    }
    private void processG2B() throws Throwable {
        short data;
        data = 2;
        goodG2BSink(data);
    }
    private void goodB2GSink(short data) throws Throwable {
        if (data < Short.MAX_VALUE) {
            short result = (short) (data + 1);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to perform addition.");
        }
    }
    private void processB2G() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        goodB2GSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
