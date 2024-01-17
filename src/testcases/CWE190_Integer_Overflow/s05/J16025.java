package testcases.CWE190_Integer_Overflow.s05;
import testcasesupport.*;
import javax.servlet.http.*;
public class J16025 extends AbstractTestCase {
    private short bSce() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        return data;
    }
    private short processG2BSce() throws Throwable {
        short data;
        data = 2;
        return data;
    }
    private void processG2B() throws Throwable {
        short data = processG2BSce();
        if (data > 0)  {
            short result = (short) (data * 2);
            IO.writeLine("result: " + result);
        }
    }
    private short processB2GSce() throws Throwable {
        short data;
        data = Short.MAX_VALUE;
        return data;
    }
    private void processB2G() throws Throwable {
        short data = processB2GSce();
        if (data > 0)  {
            if (data < (Short.MAX_VALUE / 2)) {
                short result = (short) (data * 2);
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
