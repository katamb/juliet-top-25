package testcases.CWE606_Unchecked_Loop_Condition;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE606_Unchecked_Loop_Condition__getCookies_Servlet_15_bad extends AbstractTestCaseServlet {
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        switch (6) {
            case 6:
                data = "";
            {
                Cookie cookieSources[] = request.getCookies();
                if (cookieSources != null) {
                    data = cookieSources[0].getValue();
                }
            }
            break;
            default:
                data = null;
                break;
        }
        switch (7) {
            case 7:
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
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
