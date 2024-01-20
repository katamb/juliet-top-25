package testcases.CWE78_OS_Command_Injection;
import testcasesupport.*;
import javax.servlet.http.*;
public class J20650 extends AbstractTestCaseServlet {
    private boolean privateTrue = true;
    private boolean privateFalse = false;
    public void handle(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (privateTrue) {
            data = "";
            {
                Cookie cookieSces[] = request.getCookies();
                if (cookieSces != null) {
                    data = cookieSces[0].getValue();
                }
            }
        } else {
            data = null;
        }
        String osCommand;
        if (System.getProperty("os.name").toLowerCase().indexOf("win") >= 0) {
            osCommand = "c:\\WINDOWS\\SYSTEM32\\cmd.exe /c dir ";
        } else {
            osCommand = "/bin/ls ";
        }
        Process process = Runtime.getRuntime().exec(osCommand + data);
        process.waitFor();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
