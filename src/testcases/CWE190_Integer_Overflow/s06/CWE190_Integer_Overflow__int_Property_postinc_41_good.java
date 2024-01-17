package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class CWE190_Integer_Overflow__int_Property_postinc_41_good extends AbstractTestCase {
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2BSink(int data) throws Throwable {
        data++;
        int result = (int) (data);
        IO.writeLine("result: " + result);
    }
    private void goodG2B() throws Throwable {
        int data;
        data = 2;
        goodG2BSink(data);
    }
    private void goodB2GSink(int data) throws Throwable {
        if (data < Integer.MAX_VALUE) {
            data++;
            int result = (int) (data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to increment.");
        }
    }
    private void goodB2G() throws Throwable {
        int data;
        data = Integer.MIN_VALUE;
        {
            String stringNumber = System.getProperty("user.home");
            try {
                data = Integer.parseInt(stringNumber.trim());
            } catch (NumberFormatException exceptNumberFormat) {
                IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
            }
        }
        goodB2GSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
