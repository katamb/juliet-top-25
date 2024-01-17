package testcases.CWE78_OS_Command_Injection;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
public class CWE78_OS_Command_Injection__URLConnection_05_good extends AbstractTestCase {
    private boolean privateTrue = true;
    private boolean privateFalse = false;
    private void goodG2B1() throws Throwable {
        String data;
        if (privateFalse) {
            data = null;
        } else {
            data = "foo";
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
    private void goodG2B2() throws Throwable {
        String data;
        if (privateTrue) {
            data = "foo";
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
    public void good() throws Throwable {
        goodG2B1();
        goodG2B2();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
