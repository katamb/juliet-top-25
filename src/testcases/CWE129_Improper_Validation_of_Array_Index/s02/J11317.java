package testcases.CWE129_Improper_Validation_of_Array_Index.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class J11317 extends AbstractTestCaseServlet {
    private int bSce(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
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
        return data;
    }
    private int gdG2BSce(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        data = 2;
        return data;
    }
    private void processG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data = gdG2BSce(request, response);
        int array[] = {0, 1, 2, 3, 4};
        array[data] = 42;
    }
    private int gdB2GSce(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
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
        return data;
    }
    private void processB2G(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data = gdB2GSce(request, response);
        int array[] = {0, 1, 2, 3, 4};
        if (data >= 0 && data < array.length) {
            array[data] = 42;
        } else {
            IO.writeLine("Array index out of bounds");
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
