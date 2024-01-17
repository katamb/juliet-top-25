package testcases.CWE606_Unchecked_Loop_Condition;
import testcasesupport.*;
import javax.servlet.http.*;
public class J20154 extends AbstractTestCaseServlet {
    private String bSce(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "";
        {
            Cookie cookieSces[] = request.getCookies();
            if (cookieSces != null) {
                data = cookieSces[0].getValue();
            }
        }
        return data;
    }
    public void handle(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = bSce(request, response);
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
    private String gdG2BSce(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "5";
        return data;
    }
    private String gdB2GSce(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "";
        {
            Cookie cookieSces[] = request.getCookies();
            if (cookieSces != null) {
                data = cookieSces[0].getValue();
            }
        }
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
