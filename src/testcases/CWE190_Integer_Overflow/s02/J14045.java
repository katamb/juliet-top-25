package testcases.CWE190_Integer_Overflow.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class J14045 extends AbstractTestCase {
    private int bSce() throws Throwable {
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
        return data;
    }
    private int processG2BSce() throws Throwable {
        int data;
        data = 2;
        return data;
    }
    private void processG2B() throws Throwable {
        int data = processG2BSce();
        if (data > 0)  {
            int result = (int) (data * 2);
            IO.writeLine("result: " + result);
        }
    }
    private int processB2GSce() throws Throwable {
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
        return data;
    }
    private void processB2G() throws Throwable {
        int data = processB2GSce();
        if (data > 0)  {
            if (data < (Integer.MAX_VALUE / 2)) {
                int result = (int) (data * 2);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform multiplication.");
            }
        }
    }
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
