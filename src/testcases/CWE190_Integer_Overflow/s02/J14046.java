package testcases.CWE190_Integer_Overflow.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class J14046 extends AbstractTestCase {
    private int dataB;
    private int dataGdG2B;
    private int dataGdB2G;
    private void bS() throws Throwable {
        int data = dataB;
        if (data > 0)  {
            int result = (int) (data * 2);
            IO.writeLine("result: " + result);
        }
    }
    public void handle() throws Throwable {
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
        dataB = data;
        bS();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
