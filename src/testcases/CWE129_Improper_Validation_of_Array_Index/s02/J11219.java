package testcases.CWE129_Improper_Validation_of_Array_Index.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class J11219 extends AbstractTestCaseServlet {
    private void processG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        while (true) {
            data = 2;
            break;
        }
        while (true) {
            int array[] = {0, 1, 2, 3, 4};
            IO.writeLine(array[data]);
            break;
        }
    }
    private void processB2G(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        while (true) {
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
            break;
        }
        while (true) {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0 && data < array.length) {
                IO.writeLine(array[data]);
            } else {
                IO.writeLine("Array index out of bounds");
            }
            break;
        }
    }
    public void process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        processG2B(request, response);
        processB2G(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
