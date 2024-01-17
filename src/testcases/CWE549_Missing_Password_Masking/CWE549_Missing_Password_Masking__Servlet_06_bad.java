package testcases.CWE549_Missing_Password_Masking;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE549_Missing_Password_Masking__Servlet_06_bad extends AbstractTestCaseServlet {
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            response.getWriter().println("<form id=\"form\" name=\"form\" method=\"post\" action=\"password-test-servlet\">");
            response.getWriter().println("Username: <input name=\"username\" type=\"text\" tabindex=\"10\" /><br><br>");
            response.getWriter().println("Password: <input name=\"password\" type=\"text\" tabindex=\"10\" />");
            response.getWriter().println("<input type=\"submit\" name=\"submit\" value=\"Login-bad\" /></form>");
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
