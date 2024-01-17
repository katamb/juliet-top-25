package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class CWE190_Integer_Overflow__int_Property_preinc_06_good extends AbstractTestCase {
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;
    private void goodG2B1() throws Throwable {
        int data;
        if (PRIVATE_STATIC_FINAL_FIVE != 5) {
            data = 0;
        } else {
            data = 2;
        }
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            int result = (int) (++data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B2() throws Throwable {
        int data;
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data = 2;
        } else {
            data = 0;
        }
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            int result = (int) (++data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G1() throws Throwable {
        int data;
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
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
        if (PRIVATE_STATIC_FINAL_FIVE != 5) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data < Integer.MAX_VALUE) {
                int result = (int) (++data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }
    private void goodB2G2() throws Throwable {
        int data;
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
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
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            if (data < Integer.MAX_VALUE) {
                int result = (int) (++data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }
    public void good() throws Throwable {
        goodG2B1();
        goodG2B2();
        goodB2G1();
        goodB2G2();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
