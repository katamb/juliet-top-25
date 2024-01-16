package testcases.CWE190_Integer_Overflow.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class CWE190_Integer_Overflow__int_Environment_add_17 extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
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
        for (int j = 0; j < 1; j++) {
            int result = (int) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private void goodG2B() throws Throwable {
        int data;
        data = 2;
        for (int j = 0; j < 1; j++) {
            int result = (int) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G() throws Throwable {
        int data;
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
        for (int k = 0; k < 1; k++) {
            if (data < Integer.MAX_VALUE) {
                int result = (int) (data + 1);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform addition.");
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