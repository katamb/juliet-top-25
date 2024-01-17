package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
public class J18142 extends AbstractTestCase {
    public void handle() throws Throwable {
        short data;
        if (true) {
            data = Short.MAX_VALUE;
        } else {
            data = 0;
        }
        if (true) {
            short result = (short) (++data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
