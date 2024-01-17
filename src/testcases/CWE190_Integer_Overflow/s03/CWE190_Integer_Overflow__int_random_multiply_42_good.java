package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class CWE190_Integer_Overflow__int_random_multiply_42_good extends AbstractTestCase {
    private int badSource() throws Throwable {
        int data;
        data = (new SecureRandom()).nextInt();
        return data;
    }
    private int goodG2BSource() throws Throwable {
        int data;
        data = 2;
        return data;
    }
    private void goodG2B() throws Throwable {
        int data = goodG2BSource();
        if (data > 0)  {
            int result = (int) (data * 2);
            IO.writeLine("result: " + result);
        }
    }
    private int goodB2GSource() throws Throwable {
        int data;
        data = (new SecureRandom()).nextInt();
        return data;
    }
    private void goodB2G() throws Throwable {
        int data = goodB2GSource();
        if (data > 0)  {
            if (data < (Integer.MAX_VALUE / 2)) {
                int result = (int) (data * 2);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform multiplication.");
            }
        }
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
