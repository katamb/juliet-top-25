package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16755 extends AbstractTestCase {
    private void processG2B() throws Throwable {
        int data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = 2;
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            data++;
            int result = (int) (data);
            IO.writeLine("result: " + result);
        } else {
            data++;
            int result = (int) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void processB2G() throws Throwable {
        int data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = Integer.MAX_VALUE;
        } else {
            data = Integer.MAX_VALUE;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            if (data < Integer.MAX_VALUE) {
                data++;
                int result = (int) (data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        } else {
            if (data < Integer.MAX_VALUE) {
                data++;
                int result = (int) (data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
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
