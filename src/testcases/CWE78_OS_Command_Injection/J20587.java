package testcases.CWE78_OS_Command_Injection;
import testcasesupport.*;
import javax.servlet.http.*;
public class J20587 extends AbstractTestCase {
    private void processG2B() throws Throwable {
        String data;
        data = "foo";
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
    public void process() throws Throwable {
        processG2B();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
