package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15672 extends AbstractTestCase {
    private long badSource() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        return data;
    }
    public void handle() throws Throwable {
        long data = badSource();
        long result = (long) (data * data);
        IO.writeLine("result: " + result);
    }
    private long processG2BSource() throws Throwable {
        long data;
        data = 2;
        return data;
    }
    private long processB2GSource() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
