package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
public class J17156 extends AbstractTestCase {
    public void handle() throws Throwable {
        short data;
        switch (6) {
            case 6:
                data = Short.MAX_VALUE;
                break;
            default:
                data = 0;
                break;
        }
        switch (7) {
            case 7:
                data++;
                short result = (short) (data);
                IO.writeLine("result: " + result);
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
