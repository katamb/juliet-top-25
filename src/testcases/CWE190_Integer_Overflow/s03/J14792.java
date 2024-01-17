package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J14792 extends AbstractTestCase {
    private int badSource() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        return data;
    }
    public void handle() throws Throwable {
        int data = badSource();
        int result = (int) (data + 1);
        IO.writeLine("result: " + result);
    }
    private int goodG2BSource() throws Throwable {
        int data;
        data = 2;
        return data;
    }
    private int goodB2GSource() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
