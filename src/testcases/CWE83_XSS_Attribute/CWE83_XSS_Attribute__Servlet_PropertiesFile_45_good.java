package testcases.CWE83_XSS_Attribute;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
public class CWE83_XSS_Attribute__Servlet_PropertiesFile_45_good extends AbstractTestCaseServlet {
    private String dataBad;
    private String dataGoodG2B;
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        goodG2B(request, response);
    }
    private void goodG2BSink(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = dataGoodG2B;
        if (data != null) {
            response.getWriter().println("<br>bad() - <img src=\"" + data + "\">");
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
