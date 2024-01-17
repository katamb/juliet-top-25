package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class CWE190_Integer_Overflow__int_Environment_postinc_15_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        switch (6) {
            case 6:
                data = Integer.MIN_VALUE;
            {
                String stringNumber = System.getenv("ADD");
                if (stringNumber != null)
                {
                    try {
                        data = Integer.parseInt(stringNumber.trim());
                    } catch (NumberFormatException exceptNumberFormat) {
                        IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                    }
                }
            }
            break;
            default:
                data = 0;
                break;
        }
        switch (7) {
            case 7:
                data++;
                int result = (int) (data);
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
