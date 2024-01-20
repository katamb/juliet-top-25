package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15628 extends AbstractTestCase {
    private long bSce() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        return data;
    }
    public void handle() throws Throwable {
        long data = bSce();
        if (data > 0)  {
            long result = (long) (data * 2);
            IO.writeLine("result: " + result);
        }
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
