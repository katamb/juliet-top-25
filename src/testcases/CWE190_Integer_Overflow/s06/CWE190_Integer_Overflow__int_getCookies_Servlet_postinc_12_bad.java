package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class CWE190_Integer_Overflow__int_getCookies_Servlet_postinc_12_bad extends AbstractTestCaseServlet {
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = Integer.MIN_VALUE;
            {
                Cookie cookieSources[] = request.getCookies();
                if (cookieSources != null) {
                    String stringNumber = cookieSources[0].getValue();
                    try {
                        data = Integer.parseInt(stringNumber.trim());
                    } catch (NumberFormatException exceptNumberFormat) {
                        IO.logger.log(Level.WARNING, "Number format exception reading data from cookie", exceptNumberFormat);
                    }
                }
            }
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            data++;
            int result = (int) (data);
            IO.writeLine("result: " + result);
        } else {
            if (data < Integer.MAX_VALUE) {
                data++;
                int result = (int) (data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
