package testcases.CWE549_Missing_Password_Masking;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE549_Missing_Password_Masking__Servlet_03_good extends AbstractTestCaseServlet {
    private void good1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        if (5 != 5) {
            IO.writeLine("Benign, fixed string");
        } else {
            response.getWriter().println("<form id=\"form\" name=\"form\" method=\"post\" action=\"password-test-servlet\">");
            response.getWriter().println("Username: <input name=\"username\" type=\"text\" tabindex=\"10\" /><br><br>");
            response.getWriter().println("Password: <input name=\"password\" type=\"password\" tabindex=\"10\" />");
            response.getWriter().println("<input type=\"submit\" name=\"submit\" value=\"Login-good\" /></form>");
        }
    }
    private void good2(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        if (5 == 5) {
            response.getWriter().println("<form id=\"form\" name=\"form\" method=\"post\" action=\"password-test-servlet\">");
            response.getWriter().println("Username: <input name=\"username\" type=\"text\" tabindex=\"10\" /><br><br>");
            response.getWriter().println("Password: <input name=\"password\" type=\"password\" tabindex=\"10\" />");
            response.getWriter().println("<input type=\"submit\" name=\"submit\" value=\"Login-good\" /></form>");
        }
    }
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        good1(request, response);
        good2(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
