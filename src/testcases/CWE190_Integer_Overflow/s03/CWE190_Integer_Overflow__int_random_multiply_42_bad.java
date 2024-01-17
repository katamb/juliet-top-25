package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class CWE190_Integer_Overflow__int_random_multiply_42_bad extends AbstractTestCase {
    private int badSource() throws Throwable {
        int data;
        data = (new SecureRandom()).nextInt();
        return data;
    }
    public void bad() throws Throwable {
        int data = badSource();
        if (data > 0)  {
            int result = (int) (data * 2);
            IO.writeLine("result: " + result);
        }
    }
    private int goodG2BSource() throws Throwable {
        int data;
        data = 2;
        return data;
    }
    private int goodB2GSource() throws Throwable {
        int data;
        data = (new SecureRandom()).nextInt();
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
