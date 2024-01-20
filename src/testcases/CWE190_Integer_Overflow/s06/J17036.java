package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17036 extends AbstractTestCase {
    private long bSce() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        return data;
    }
    public void handle() throws Throwable {
        long data = bSce();
        data++;
        long result = (long) (data);
        IO.writeLine("result: " + result);
    }
    private long processG2BSce() throws Throwable {
        long data;
        data = 2;
        return data;
    }
    private long processB2GSce() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
