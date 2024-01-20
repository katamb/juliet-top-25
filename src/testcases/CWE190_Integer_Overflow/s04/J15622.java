package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
public class J15622 extends AbstractTestCase {
    private boolean bPrivate = false;
    public void handle() throws Throwable {
        long data;
        data = Long.MAX_VALUE;
        bPrivate = true;
        bS(data);
    }
    private void bS(long data) throws Throwable {
        if (bPrivate) {
            if (data > 0)  {
                long result = (long) (data * 2);
                IO.writeLine("result: " + result);
            }
        }
    }
    private boolean gB2G1Private = false;
    private boolean gB2G2Private = false;
    private boolean gG2BPrivate = false;
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
