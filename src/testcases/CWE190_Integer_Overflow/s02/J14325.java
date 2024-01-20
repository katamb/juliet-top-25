package testcases.CWE190_Integer_Overflow.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class J14325 extends AbstractTestCaseServlet {
    private int privateFive = 5;
    private void gG2B1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        if (privateFive != 5) {
            data = 0;
        } else {
            data = 2;
        }
        if (privateFive == 5) {
            int result = (int) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    private void gG2B2(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        if (privateFive == 5) {
            data = 2;
        } else {
            data = 0;
        }
        if (privateFive == 5) {
            int result = (int) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    private void gB2G1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        if (privateFive == 5) {
            data = Integer.MIN_VALUE;
            {
                Cookie cookieSces[] = request.getCookies();
                if (cookieSces != null) {
                    String stringNumber = cookieSces[0].getValue();
                    try {
                        data = Integer.parseInt(stringNumber.trim());
                    } catch (NumberFormatException exceptNumberFormat) {
                        IO.logger.log(Level.WARNING, "Number format exception reading data from cookie", exceptNumberFormat);
                    }
                }
            }
        } else {
            data = 0;
        }
        if (privateFive != 5) {
            IO.writeLine("Benign, fixed string");
        } else {
            if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Integer.MAX_VALUE))) {
                int result = (int) (data * data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform squaring.");
            }
        }
    }
    private void gB2G2(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        if (privateFive == 5) {
            data = Integer.MIN_VALUE;
            {
                Cookie cookieSces[] = request.getCookies();
                if (cookieSces != null) {
                    String stringNumber = cookieSces[0].getValue();
                    try {
                        data = Integer.parseInt(stringNumber.trim());
                    } catch (NumberFormatException exceptNumberFormat) {
                        IO.logger.log(Level.WARNING, "Number format exception reading data from cookie", exceptNumberFormat);
                    }
                }
            }
        } else {
            data = 0;
        }
        if (privateFive == 5) {
            if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Integer.MAX_VALUE))) {
                int result = (int) (data * data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform squaring.");
            }
        }
    }
    public void process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        gG2B1(request, response);
        gG2B2(request, response);
        gB2G1(request, response);
        gB2G2(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
