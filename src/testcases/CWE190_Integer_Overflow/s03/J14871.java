package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J14871 extends AbstractTestCase {
    private void processG2B() throws Throwable {
        int data;
        while (true) {
            data = 2;
            break;
        }
        while (true) {
            int result = (int) (data * data);
            IO.writeLine("result: " + result);
            break;
        }
    }
    private void processB2G() throws Throwable {
        int data;
        while (true) {
            data = Integer.MAX_VALUE;
            break;
        }
        while (true) {
            if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Integer.MAX_VALUE))) {
                int result = (int) (data * data);
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
