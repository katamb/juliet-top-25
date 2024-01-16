package testcases.CWE78_OS_Command_Injection;
import testcasesupport.*;
import javax.servlet.http.*;
public class CWE78_OS_Command_Injection__Environment_11 extends AbstractTestCase {
    public void bad() throws Throwable {
        String data;
        if (IO.staticReturnsTrue()) {
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
    private void goodG2B1() throws Throwable {
        String data;
        if (IO.staticReturnsFalse()) {
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
        if (IO.staticReturnsTrue()) {
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