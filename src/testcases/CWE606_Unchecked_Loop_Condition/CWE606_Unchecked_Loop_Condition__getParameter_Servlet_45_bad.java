package testcases.CWE606_Unchecked_Loop_Condition;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE606_Unchecked_Loop_Condition__getParameter_Servlet_45_bad extends AbstractTestCaseServlet {
    private String dataBad;
    private String dataGoodG2B;
    private String dataGoodB2G;
    private void badSink(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = dataBad;
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
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = request.getParameter("name");
        dataBad = data;
        badSink(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
