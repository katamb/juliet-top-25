package testcases.CWE81_XSS_Error_Message;
import testcasesupport.*;
import javax.servlet.http.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
public class CWE81_XSS_Error_Message__Servlet_database_45_good extends AbstractTestCaseServlet {
    private String dataBad;
    private String dataGoodG2B;
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        goodG2B(request, response);
    }
    private void goodG2BSink(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = dataGoodG2B;
        if (data != null) {
            response.sendError(404, "<br>bad() - Parameter name has value " + data);
        }
    }
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "foo";
        dataGoodG2B = data;
        goodG2BSink(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
