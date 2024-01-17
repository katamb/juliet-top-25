package testcases.CWE523_Unprotected_Cred_Transport;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.logging.Level;
public class J19787 extends AbstractTestCaseServlet {
    private void process1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        if (5 != 5) {
            IO.writeLine("Benign, fixed string");
        } else {
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
        }
    }
    private void good2(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        if (5 == 5) {
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
        }
    }
    public void process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        process1(request, response);
        good2(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
