package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class CWE190_Integer_Overflow__int_Property_postinc_10_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        if (IO.staticTrue) {
            data = Integer.MIN_VALUE;
            {
                String stringNumber = System.getProperty("user.home");
                try {
                    data = Integer.parseInt(stringNumber.trim());
                } catch (NumberFormatException exceptNumberFormat) {
                    IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                }
            }
        } else {
            data = 0;
        }
        if (IO.staticTrue) {
            data++;
            int result = (int) (data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
