package testcases.CWE549_Missing_Password_Masking;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE549_Missing_Password_Masking__Servlet_15_bad extends AbstractTestCaseServlet {
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        switch (7) {
            case 7:
                response.getWriter().println("<form id=\"form\" name=\"form\" method=\"post\" action=\"password-test-servlet\">");
                response.getWriter().println("Username: <input name=\"username\" type=\"text\" tabindex=\"10\" /><br><br>");
                response.getWriter().println("Password: <input name=\"password\" type=\"text\" tabindex=\"10\" />");
                response.getWriter().println("<input type=\"submit\" name=\"submit\" value=\"Login-bad\" /></form>");
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
