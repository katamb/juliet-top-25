package testcases.CWE606_Unchecked_Loop_Condition;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE606_Unchecked_Loop_Condition__getParameter_Servlet_03_bad extends AbstractTestCaseServlet {
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (5 == 5) {
            data = request.getParameter("name");
        } else {
            data = null;
        }
        if (5 == 5) {
            int numberOfLoops;
            try {
                numberOfLoops = Integer.parseInt(data);
            } catch (NumberFormatException exceptNumberFormat) {
                IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
                numberOfLoops = 1;
            }
            for (int i = 0; i < numberOfLoops; i++) {
                IO.writeLine("hello world");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
