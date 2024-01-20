package testcases.CWE190_Integer_Overflow.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class J14443 extends AbstractTestCaseServlet {
    private int dataB;
    private int dataGdG2B;
    private int dataGdB2G;
    public void process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        processG2B(request, response);
        processB2G(request, response);
    }
    private void gG2BS(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data = dataGdG2B;
        if (data > 0)  {
            int result = (int) (data * 2);
            IO.writeLine("result: " + result);
        }
    }
    private void processG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        data = 2;
        dataGdG2B = data;
        gG2BS(request, response);
    }
    private void gB2GS(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data = dataGdB2G;
        if (data > 0)  {
            if (data < (Integer.MAX_VALUE / 2)) {
                int result = (int) (data * 2);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform multiplication.");
            }
        }
    }
    private void processB2G(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        data = Integer.MIN_VALUE;
        {
            String stringNumber = request.getParameter("name");
            try {
                data = Integer.parseInt(stringNumber.trim());
            } catch (NumberFormatException exceptNumberFormat) {
                IO.logger.log(Level.WARNING, "Number format exception reading data from parameter 'name'", exceptNumberFormat);
            }
        }
        dataGdB2G = data;
        gB2GS(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
