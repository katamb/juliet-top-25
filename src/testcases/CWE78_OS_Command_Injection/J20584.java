package testcases.CWE78_OS_Command_Injection;
import testcasesupport.*;
import javax.servlet.http.*;
public class J20584 extends AbstractTestCase {
    public void handle() throws Throwable {
        String data;
        while (true) {
            data = System.getenv("ADD");
            break;
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
