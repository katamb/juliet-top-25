package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
public class J14880 extends AbstractTestCase {
    private int bSce() throws Throwable {
        int data;
        data = Integer.MAX_VALUE;
        return data;
    }
    public void handle() throws Throwable {
        int data = bSce();
        int result = (int) (data * data);
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
