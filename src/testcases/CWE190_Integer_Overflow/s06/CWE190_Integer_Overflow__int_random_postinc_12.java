package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class CWE190_Integer_Overflow__int_random_postinc_12 extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = (new SecureRandom()).nextInt();
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            data++;
            int result = (int) (data);
            IO.writeLine("result: " + result);
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
    private void goodG2B() throws Throwable {
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
    private void goodB2G() throws Throwable {
        int data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = (new SecureRandom()).nextInt();
        } else {
            data = (new SecureRandom()).nextInt();
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
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}