package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J18092 extends AbstractTestCase {
    private long bSce() throws Throwable {
        long data;
        data = (new java.security.SecureRandom()).nextLong();
        return data;
    }
    public void handle() throws Throwable {
        long data = bSce();
        long result = (long) (++data);
        IO.writeLine("result: " + result);
    }
    private long processG2BSce() throws Throwable {
        long data;
        data = 2;
        return data;
    }
    private long processB2GSce() throws Throwable {
        long data;
        data = (new java.security.SecureRandom()).nextLong();
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
