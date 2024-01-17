package testcases.CWE78_OS_Command_Injection;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE78_OS_Command_Injection__getParameter_Servlet_41_bad extends AbstractTestCaseServlet {
    private void badSink(String data, HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String osCommand;
        if (System.getProperty("os.name").toLowerCase().indexOf("win") >= 0) {
            osCommand = "c:\\WINDOWS\\SYSTEM32\\cmd.exe /c dir ";
        } else {
            osCommand = "/bin/ls ";
        }
        Process process = Runtime.getRuntime().exec(osCommand + data);
        process.waitFor();
    }
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = request.getParameter("name");
        badSink(data, request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
