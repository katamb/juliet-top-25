package testcases.CWE83_XSS_Attribute;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
public class CWE83_XSS_Attribute__Servlet_PropertiesFile_01_good extends AbstractTestCaseServlet {
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        goodG2B(request, response);
    }
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "foo";
        if (data != null) {
            response.getWriter().println("<br>bad() - <img src=\"" + data + "\">");
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
