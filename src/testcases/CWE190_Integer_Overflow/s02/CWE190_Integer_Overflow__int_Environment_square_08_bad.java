package testcases.CWE190_Integer_Overflow.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class CWE190_Integer_Overflow__int_Environment_square_08_bad extends AbstractTestCase {
    private boolean privateReturnsTrue() {
        return true;
    }
    private boolean privateReturnsFalse() {
        return false;
    }
    public void bad() throws Throwable {
        int data;
        if (privateReturnsTrue()) {
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
        } else {
            data = 0;
        }
        if (privateReturnsTrue()) {
            int result = (int) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
