package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class J17916 extends AbstractTestCase {
    private int bSce() throws Throwable {
        int data;
        data = (new SecureRandom()).nextInt();
        return data;
    }
    public void handle() throws Throwable {
        int data = bSce();
        int result = (int) (++data);
        IO.writeLine("result: " + result);
    }
    private int processG2BSce() throws Throwable {
        int data;
        data = 2;
        return data;
    }
    private int processB2GSce() throws Throwable {
        int data;
        data = (new SecureRandom()).nextInt();
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
