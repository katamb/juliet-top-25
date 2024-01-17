package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class CWE190_Integer_Overflow__int_Property_preinc_12_good extends AbstractTestCase {
    private void goodG2B() throws Throwable {
        int data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = 2;
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            int result = (int) (++data);
            IO.writeLine("result: " + result);
        } else {
            int result = (int) (++data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G() throws Throwable {
        int data;
        if (IO.staticReturnsTrueOrFalse()) {
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
            data = Integer.MIN_VALUE;
            {
                String stringNumber = System.getProperty("user.home");
                try {
                    data = Integer.parseInt(stringNumber.trim());
                } catch (NumberFormatException exceptNumberFormat) {
                    IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                }
            }
        }
        if (IO.staticReturnsTrueOrFalse()) {
            if (data < Integer.MAX_VALUE) {
                int result = (int) (++data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        } else {
            if (data < Integer.MAX_VALUE) {
                int result = (int) (++data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
