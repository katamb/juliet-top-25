package testcases.CWE606_Unchecked_Loop_Condition;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE606_Unchecked_Loop_Condition__getCookies_Servlet_01 extends AbstractTestCaseServlet {
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "";
        {
            Cookie cookieSources[] = request.getCookies();
            if (cookieSources != null) {
                data = cookieSources[0].getValue();
            }
        }
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
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        goodG2B(request, response);
        goodB2G(request, response);
    }
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "5";
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
    private void goodB2G(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "";
        {
            Cookie cookieSources[] = request.getCookies();
            if (cookieSources != null) {
                data = cookieSources[0].getValue();
            }
        }
        int numberOfLoops;
        try {
            numberOfLoops = Integer.parseInt(data);
        } catch (NumberFormatException exceptNumberFormat) {
            IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
            numberOfLoops = 1;
        }
        if (numberOfLoops >= 0 && numberOfLoops <= 5) {
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