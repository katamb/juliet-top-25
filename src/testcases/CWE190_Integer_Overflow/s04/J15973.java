package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15973 extends AbstractTestCase {
    private void processG2B() throws Throwable {
        short data;
        data = 2;
        for (int j = 0; j < 1; j++) {
            short result = (short) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private void processB2G() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        for (int k = 0; k < 1; k++) {
            if (data < Short.MAX_VALUE) {
                short result = (short) (data + 1);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform addition.");
            }
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
