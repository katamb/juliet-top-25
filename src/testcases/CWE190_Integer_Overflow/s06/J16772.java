package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16772 extends AbstractTestCase {
    private int bSce() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        return data;
    }
    public void handle() throws Throwable {
        int data = bSce();
        data++;
        int result = (int) (data);
        IO.writeLine("result: " + result);
    }
    private int processG2BSce() throws Throwable {
        int data;
        data = 2;
        return data;
    }
    private int processB2GSce() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
