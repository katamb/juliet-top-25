package testcases.CWE78_OS_Command_Injection;
import testcasesupport.*;
import javax.servlet.http.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
public class J20549 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
    }
    private void goodG2BSink(String data) throws Throwable {
        String osCommand;
        if (System.getProperty("os.name").toLowerCase().indexOf("win") >= 0) {
            osCommand = "c:\\WINDOWS\\SYSTEM32\\cmd.exe /c dir ";
        } else {
            osCommand = "/bin/ls ";
        }
        Process process = Runtime.getRuntime().exec(osCommand + data);
        process.waitFor();
    }
    private void processG2B() throws Throwable {
        String data;
        data = "foo";
        goodG2BSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
