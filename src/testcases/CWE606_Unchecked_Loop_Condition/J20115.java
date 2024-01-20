package testcases.CWE606_Unchecked_Loop_Condition;
import testcasesupport.*;
import javax.servlet.http.*;
public class J20115 extends AbstractTestCaseServlet {
    public void process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        processG2B(request, response);
        processB2G(request, response);
    }
    private void processG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
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
    private void processB2G(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "";
        {
            Cookie cookieSces[] = request.getCookies();
            if (cookieSces != null) {
                data = cookieSces[0].getValue();
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
