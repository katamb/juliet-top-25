package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J13416 extends AbstractTestCase {
    public void handle() throws Throwable {
        byte data;
        switch (6) {
            case 6:
                data = Byte.MAX_VALUE;
                break;
            default:
                data = 0;
                break;
        }
        switch (7) {
            case 7:
                byte result = (byte) (data * data);
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
