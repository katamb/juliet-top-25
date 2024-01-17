package testcases.CWE80_XSS.s01;
import testcasesupport.*;
import javax.servlet.http.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
public class CWE80_XSS__Servlet_database_06_good extends AbstractTestCaseServlet {
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;
    private void goodG2B1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (PRIVATE_STATIC_FINAL_FIVE != 5) {
            data = null;
        } else {
            data = "foo";
        }
        if (data != null) {
            response.getWriter().println("<br>bad(): data = " + data);
        }
    }
    private void goodG2B2(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            data = "foo";
        } else {
            data = null;
        }
        if (data != null) {
            response.getWriter().println("<br>bad(): data = " + data);
        }
    }
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        goodG2B1(request, response);
        goodG2B2(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
