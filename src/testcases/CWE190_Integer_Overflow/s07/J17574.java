package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class J17574 extends AbstractTestCaseServlet {
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;
    public void handle(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        if (PRIVATE_STATIC_FINAL_TRUE) {
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
        if (PRIVATE_STATIC_FINAL_TRUE) {
            int result = (int) (++data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
