package testcases.CWE549_Missing_Password_Masking;
import testcasesupport.*;
import javax.servlet.http.*;
public class J19845 extends AbstractTestCaseServlet {
    private void process1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        switch (8) {
            case 7:
                IO.writeLine("Benign, fixed string");
                break;
            default:
                response.getWriter().println("<form id=\"form\" name=\"form\" method=\"post\" action=\"password-test-servlet\">");
                response.getWriter().println("Username: <input name=\"username\" type=\"text\" tabindex=\"10\" /><br><br>");
                response.getWriter().println("Password: <input name=\"password\" type=\"password\" tabindex=\"10\" />");
                response.getWriter().println("<input type=\"submit\" name=\"submit\" value=\"log-in\" /></form>");
                break;
        }
    }
    private void g2(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        switch (7) {
            case 7:
                response.getWriter().println("<form id=\"form\" name=\"form\" method=\"post\" action=\"password-test-servlet\">");
                response.getWriter().println("Username: <input name=\"username\" type=\"text\" tabindex=\"10\" /><br><br>");
                response.getWriter().println("Password: <input name=\"password\" type=\"password\" tabindex=\"10\" />");
                response.getWriter().println("<input type=\"submit\" name=\"submit\" value=\"log-in\" /></form>");
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    public void process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        process1(request, response);
        g2(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
