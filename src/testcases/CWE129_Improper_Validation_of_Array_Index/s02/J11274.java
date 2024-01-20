package testcases.CWE129_Improper_Validation_of_Array_Index.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class J11274 extends AbstractTestCaseServlet {
    private int dataB;
    private int dataGdG2B;
    private int dataGdB2G;
    private void bS(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data = dataB;
        int array[] = null;
        if (data >= 0) {
            array = new int[data];
        } else {
            IO.writeLine("Array size is negative");
        }
        array[0] = 5;
        IO.writeLine(array[0]);
    }
    public void handle(HttpServletRequest request, HttpServletResponse response) throws Throwable {
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
        dataB = data;
        bS(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
