package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15582 extends AbstractTestCase {
    private void bS(long data) throws Throwable {
        long result = (long) (data + 1);
        IO.writeLine("result: " + result);
    }
    public void handle() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        bS(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
