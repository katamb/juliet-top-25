package testcases.CWE129_Improper_Validation_of_Array_Index.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class J11291 extends AbstractTestCaseServlet {
    private boolean privateReturnsTrue() {
        return true;
    }
    private boolean privateReturnsFalse() {
        return false;
    }
    private void goodG2B1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        if (privateReturnsFalse()) {
            data = 0;
        } else {
            data = 2;
        }
        if (privateReturnsTrue()) {
            int array[] = {0, 1, 2, 3, 4};
            array[data] = 42;
        }
    }
    private void goodG2B2(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        if (privateReturnsTrue()) {
            data = 2;
        } else {
            data = 0;
        }
        if (privateReturnsTrue()) {
            int array[] = {0, 1, 2, 3, 4};
            array[data] = 42;
        }
    }
    private void goodB2G1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        if (privateReturnsTrue()) {
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
            data = 0;
        }
        if (privateReturnsFalse()) {
            IO.writeLine("Benign, fixed string");
        } else {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0 && data < array.length) {
                array[data] = 42;
            } else {
                IO.writeLine("Array index out of bounds");
            }
        }
    }
    private void goodB2G2(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        if (privateReturnsTrue()) {
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
            data = 0;
        }
        if (privateReturnsTrue()) {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0 && data < array.length) {
                array[data] = 42;
            } else {
                IO.writeLine("Array index out of bounds");
            }
        }
    }
    public void process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        goodG2B1(request, response);
        goodG2B2(request, response);
        goodB2G1(request, response);
        goodB2G2(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
