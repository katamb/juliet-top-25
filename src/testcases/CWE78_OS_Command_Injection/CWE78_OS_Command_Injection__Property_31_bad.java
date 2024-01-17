package testcases.CWE78_OS_Command_Injection;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE78_OS_Command_Injection__Property_31_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        String dataCopy;
        {
            String data;
            data = System.getProperty("user.home");
            dataCopy = data;
        }
        {
            String data = dataCopy;
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
