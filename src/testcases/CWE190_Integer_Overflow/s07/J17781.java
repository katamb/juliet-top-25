package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17781 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void processG2B() throws Throwable {
        int dataCopy;
        {
            int data;
            data = 2;
            dataCopy = data;
        }
        {
            int data = dataCopy;
            int result = (int) (++data);
            IO.writeLine("result: " + result);
        }
    }
    private void processB2G() throws Throwable {
        int dataCopy;
        {
            int data;
            data = Integer.MAX_VALUE;
            dataCopy = data;
        }
        {
            int data = dataCopy;
            if (data < Integer.MAX_VALUE) {
                int result = (int) (++data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
