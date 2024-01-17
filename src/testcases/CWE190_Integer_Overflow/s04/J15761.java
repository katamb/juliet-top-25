package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15761 extends AbstractTestCase {
    private long bSce() throws Throwable {
        long data;
        data = (new java.security.SecureRandom()).nextLong();
        return data;
    }
    private long processG2BSce() throws Throwable {
        long data;
        data = 2;
        return data;
    }
    private void processG2B() throws Throwable {
        long data = processG2BSce();
        if (data > 0)  {
            long result = (long) (data * 2);
            IO.writeLine("result: " + result);
        }
    }
    private long processB2GSce() throws Throwable {
        long data;
        data = (new java.security.SecureRandom()).nextLong();
        return data;
    }
    private void processB2G() throws Throwable {
        long data = processB2GSce();
        if (data > 0)  {
            if (data < (Long.MAX_VALUE / 2)) {
                long result = (long) (data * 2);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform multiplication.");
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
