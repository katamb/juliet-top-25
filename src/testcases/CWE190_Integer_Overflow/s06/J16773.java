package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16773 extends AbstractTestCase {
    private int bSce() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        return data;
    }
    private int processG2BSce() throws Throwable {
        int data;
        data = 2;
        return data;
    }
    private void processG2B() throws Throwable {
        int data = processG2BSce();
        data++;
        int result = (int) (data);
        IO.writeLine("result: " + result);
    }
    private int processB2GSce() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        return data;
    }
    private void processB2G() throws Throwable {
        int data = processB2GSce();
        if (data < Integer.MAX_VALUE) {
            data++;
            int result = (int) (data);
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
