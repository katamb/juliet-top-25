package testcases.CWE523_Unprotected_Cred_Transport;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.logging.Level;
public class CWE523_Unprotected_Cred_Transport__Servlet_16 extends AbstractTestCaseServlet {
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        while (true) {
            PrintWriter writer = null;
            try {
                writer = response.getWriter();
                writer.println("<form action='http://hostname.com/j_security_check' method='post'>");
                writer.println("<table>");
                writer.println("<tr><td>Name:</td>");
                writer.println("<td><input type='text' name='j_username'></td></tr>");
                writer.println("<tr><td>Password:</td>");
                writer.println("<td><input type='password' name='j_password' size='8'></td>");
                writer.println("</tr>");
                writer.println("</table><br />");
                writer.println("<input type='submit' value='login'>");
                writer.println("</form>");
            } catch (IOException exceptIO) {
                IO.logger.log(Level.WARNING, "There was a problem writing", exceptIO);
            } finally {
                if (writer != null) {
                    writer.close();
                }
            }
            break;
        }
    }
    private void good1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        while (true) {
            PrintWriter writer = null;
            try {
                writer = response.getWriter();
                writer.println("<form action='https://hostname.com/j_security_check' method='post'>");
                writer.println("<table>");
                writer.println("<tr><td>Name:</td>");
                writer.println("<td><input type='text' name='j_username'></td></tr>");
                writer.println("<tr><td>Password:</td>");
                writer.println("<td><input type='password' name='j_password' size='8'></td>");
                writer.println("</tr>");
                writer.println("</table><br />");
                writer.println("<input type='submit' value='login'>");
                writer.println("</form>");
            } catch (IOException exceptIO) {
                IO.logger.log(Level.WARNING, "There was a problem writing", exceptIO);
            } finally {
                if (writer != null) {
                    writer.close();
                }
            }
            break;
        }
    }
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        good1(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}