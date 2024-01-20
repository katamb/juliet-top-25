package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16059 extends AbstractTestCase {
    private void processG2B() throws Throwable {
        short data;
        while (true) {
            data = 2;
            break;
        }
        while (true) {
            short result = (short) (data * data);
            IO.writeLine("result: " + result);
            break;
        }
    }
    private void processB2G() throws Throwable {
        short data;
        while (true) {
            data = Short.MAX_VALUE;
            break;
        }
        while (true) {
            if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Short.MAX_VALUE))) {
                short result = (short) (data * data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform squaring.");
            }
            break;
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
