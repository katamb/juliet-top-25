package testcases.CWE190_Integer_Overflow.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class J14431 extends AbstractTestCaseServlet {
    private void processG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        while (true) {
            data = 2;
            break;
        }
        while (true) {
            if (data > 0)  {
                int result = (int) (data * 2);
                IO.writeLine("result: " + result);
            }
            break;
        }
    }
    private void processB2G(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        int data;
        while (true) {
            data = Integer.MIN_VALUE;
            {
                String stringNumber = request.getParameter("name");
                try {
                    data = Integer.parseInt(stringNumber.trim());
                } catch (NumberFormatException exceptNumberFormat) {
                    IO.logger.log(Level.WARNING, "Number format exception reading data from parameter 'name'", exceptNumberFormat);
                }
            }
            break;
        }
        while (true) {
            if (data > 0)  {
                if (data < (Integer.MAX_VALUE / 2)) {
                    int result = (int) (data * 2);
                    IO.writeLine("result: " + result);
                } else {
                    IO.writeLine("data value is too large to perform multiplication.");
                }
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
