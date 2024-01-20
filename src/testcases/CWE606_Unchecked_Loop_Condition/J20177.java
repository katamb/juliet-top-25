package testcases.CWE606_Unchecked_Loop_Condition;
import testcasesupport.*;
import javax.servlet.http.*;
public class J20177 extends AbstractTestCaseServlet {
    private void gG2B1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (IO.staticFalse) {
            data = null;
        } else {
            data = "5";
        }
        if (IO.staticTrue) {
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
    private void gG2B2(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (IO.staticTrue) {
            data = "5";
        } else {
            data = null;
        }
        if (IO.staticTrue) {
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
    private void gB2G1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (IO.staticTrue) {
            data = request.getParameter("name");
        } else {
            data = null;
        }
        if (IO.staticFalse) {
            IO.writeLine("Benign, fixed string");
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
    private void gB2G2(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (IO.staticTrue) {
            data = request.getParameter("name");
        } else {
            data = null;
        }
        if (IO.staticTrue) {
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
    public void process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        gG2B1(request, response);
        gG2B2(request, response);
        gB2G1(request, response);
        gB2G2(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
