package testcases.CWE78_OS_Command_Injection;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE78_OS_Command_Injection__Environment_05_bad extends AbstractTestCase {
    private boolean privateTrue = true;
    private boolean privateFalse = false;
    public void bad() throws Throwable {
        String data;
        if (privateTrue) {
            data = System.getenv("ADD");
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
