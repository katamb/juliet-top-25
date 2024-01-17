package testcases.CWE78_OS_Command_Injection;
import testcasesupport.*;
import javax.servlet.http.*;
public class J20595 extends AbstractTestCase {
    private String badSource() throws Throwable {
        String data;
        data = System.getenv("ADD");
        return data;
    }
    private String processG2BSource() throws Throwable {
        String data;
        data = "foo";
        return data;
    }
    private void processG2B() throws Throwable {
        String data = processG2BSource();
        String osCommand;
        if (System.getProperty("os.name").toLowerCase().indexOf("win") >= 0) {
            osCommand = "c:\\WINDOWS\\SYSTEM32\\cmd.exe /c dir ";
        } else {
            osCommand = "/bin/ls ";
        }
        Process process = Runtime.getRuntime().exec(osCommand + data);
        process.waitFor();
    }
    public void process() throws Throwable {
        processG2B();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
