package testcases.CWE81_XSS_Error_Message;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
public class CWE81_XSS_Error_Message__Servlet_PropertiesFile_05_bad extends AbstractTestCaseServlet {
    private boolean privateTrue = true;
    private boolean privateFalse = false;
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (privateTrue) {
            data = "";
            {
                Properties properties = new Properties();
                FileInputStream streamFileInput = null;
                try {
                    streamFileInput = new FileInputStream("../common/config.properties");
                    properties.load(streamFileInput);
                    data = properties.getProperty("data");
                } catch (IOException exceptIO) {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                } finally {
                    try {
                        if (streamFileInput != null) {
                            streamFileInput.close();
                        }
                    } catch (IOException exceptIO) {
                        IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
                    }
                }
            }
        } else {
            data = null;
        }
        if (data != null) {
            response.sendError(404, "<br>bad() - Parameter name has value " + data);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
