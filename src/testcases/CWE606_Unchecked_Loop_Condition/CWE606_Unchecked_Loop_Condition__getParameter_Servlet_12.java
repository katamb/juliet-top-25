package testcases.CWE606_Unchecked_Loop_Condition;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE606_Unchecked_Loop_Condition__getParameter_Servlet_12 extends AbstractTestCaseServlet {
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = request.getParameter("name");
        } else {
            data = "5";
        }
        if (IO.staticReturnsTrueOrFalse()) {
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
        } else {
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
    }
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = "5";
        } else {
            data = "5";
        }
        if (IO.staticReturnsTrueOrFalse()) {
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
        } else {
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
    private void goodB2G(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = request.getParameter("name");
        } else {
            data = request.getParameter("name");
        }
        if (IO.staticReturnsTrueOrFalse()) {
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
        } else {
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
    }
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        goodG2B(request, response);
        goodB2G(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}