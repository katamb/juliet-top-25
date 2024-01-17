package testcases.CWE78_OS_Command_Injection;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.StringTokenizer;
public class CWE78_OS_Command_Injection__getQueryString_Servlet_17_bad extends AbstractTestCaseServlet {
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "";
        {
            StringTokenizer tokenizer = new StringTokenizer(request.getQueryString(), "&");
            while (tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken();
                if (token.startsWith("id="))  {
                    data = token.substring(3);
                    break;
                }
            }
        }
        for (int i = 0; i < 1; i++) {
            String osCommand;
            if (System.getProperty("os.name").toLowerCase().indexOf("win") >= 0) {
                osCommand = "c:\\WINDOWS\\SYSTEM32\\cmd.exe /c dir ";
            } else {
                osCommand = "/bin/ls ";
            }
            Process process = Runtime.getRuntime().exec(osCommand + data);
            process.waitFor();
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
