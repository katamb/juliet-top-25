package testcases.CWE190_Integer_Overflow.s03;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class J15037 extends AbstractTestCase {
    private void processG2B1() throws Throwable {
        int data;
        if (IO.staticReturnsFalse()) {
            data = 0;
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrue()) {
            int result = (int) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private void processG2B2() throws Throwable {
        int data;
        if (IO.staticReturnsTrue()) {
            data = 2;
        } else {
            data = 0;
        }
        if (IO.staticReturnsTrue()) {
            int result = (int) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private void processB2G1() throws Throwable {
        int data;
        if (IO.staticReturnsTrue()) {
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
        if (IO.staticReturnsFalse()) {
            IO.writeLine("Benign, fixed string");
        } else {
            if (data < Integer.MAX_VALUE) {
                int result = (int) (data + 1);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform addition.");
            }
        }
    }
    private void processB2G2() throws Throwable {
        int data;
        if (IO.staticReturnsTrue()) {
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
        if (IO.staticReturnsTrue()) {
            if (data < Integer.MAX_VALUE) {
                int result = (int) (data + 1);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform addition.");
            }
        }
    }
    public void process() throws Throwable {
        processG2B1();
        processG2B2();
        processB2G1();
        processB2G2();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
