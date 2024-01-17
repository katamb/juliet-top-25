package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class J15188 extends AbstractTestCase {
    private int badSource() throws Throwable {
        int data;
        data = (new SecureRandom()).nextInt();
        return data;
    }
    public void handle() throws Throwable {
        int data = badSource();
        int result = (int) (data + 1);
        IO.writeLine("result: " + result);
    }
    private int processG2BSource() throws Throwable {
        int data;
        data = 2;
        return data;
    }
    private int processB2GSource() throws Throwable {
        int data;
        data = (new SecureRandom()).nextInt();
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
