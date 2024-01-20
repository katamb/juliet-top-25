package testcases.CWE549_Missing_Password_Masking;
import testcasesupport.*;
import javax.servlet.http.*;
public class J19824 extends AbstractTestCaseServlet {
    private boolean privateTrue = true;
    private boolean privateFalse = false;
    public void handle(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        if (privateTrue) {
            response.getWriter().println("<form id=\"form\" name=\"form\" method=\"post\" action=\"password-test-servlet\">");
            response.getWriter().println("Username: <input name=\"username\" type=\"text\" tabindex=\"10\" /><br><br>");
            response.getWriter().println("Password: <input name=\"password\" type=\"text\" tabindex=\"10\" />");
            response.getWriter().println("<input type=\"submit\" name=\"submit\" value=\"Login-b\" /></form>");
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
