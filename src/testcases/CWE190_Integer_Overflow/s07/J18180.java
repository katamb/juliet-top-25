package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J18180 extends AbstractTestCase {
    private short bSce() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        return data;
    }
    public void handle() throws Throwable {
        short data = bSce();
        short result = (short) (++data);
        IO.writeLine("result: " + result);
    }
    private short processG2BSce() throws Throwable {
        short data;
        data = 2;
        return data;
    }
    private short processB2GSce() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
