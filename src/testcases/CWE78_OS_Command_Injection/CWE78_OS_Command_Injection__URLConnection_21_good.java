package testcases.CWE78_OS_Command_Injection;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
public class CWE78_OS_Command_Injection__URLConnection_21_good extends AbstractTestCase {
    private boolean badPrivate = false;
    private String bad_source() throws Throwable {
        String data;
        if (badPrivate) {
            data = "";
            {
                URLConnection urlConnection = (new URL("http://www.example.org/")).openConnection();
                BufferedReader readerBuffered = null;
                InputStreamReader readerInputStream = null;
                try {
                    readerInputStream = new InputStreamReader(urlConnection.getInputStream(), "UTF-8");
                    readerBuffered = new BufferedReader(readerInputStream);
                    data = readerBuffered.readLine();
                } catch (IOException exceptIO) {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                } finally {
                    try {
                        if (readerBuffered != null) {
                            readerBuffered.close();
                        }
                    } catch (IOException exceptIO) {
                        IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                    }
                    try {
                        if (readerInputStream != null) {
                            readerInputStream.close();
                        }
                    } catch (IOException exceptIO) {
                        IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                    }
                }
            }
        } else {
            data = null;
        }
        return data;
    }
    private boolean goodG2B1_private = false;
    private boolean goodG2B2_private = false;
    public void good() throws Throwable {
        goodG2B1();
        goodG2B2();
    }
    private void goodG2B1() throws Throwable {
        String data;
        goodG2B1_private = false;
        data = goodG2B1_source();
        String osCommand;
        if (System.getProperty("os.name").toLowerCase().indexOf("win") >= 0) {
            osCommand = "c:\\WINDOWS\\SYSTEM32\\cmd.exe /c dir ";
        } else {
            osCommand = "/bin/ls ";
        }
        Process process = Runtime.getRuntime().exec(osCommand + data);
        process.waitFor();
    }
    private String goodG2B1_source() throws Throwable {
        String data = null;
        if (goodG2B1_private) {
            data = null;
        } else {
            data = "foo";
        }
        return data;
    }
    private void goodG2B2() throws Throwable {
        String data;
        goodG2B2_private = true;
        data = goodG2B2_source();
        String osCommand;
        if (System.getProperty("os.name").toLowerCase().indexOf("win") >= 0) {
            osCommand = "c:\\WINDOWS\\SYSTEM32\\cmd.exe /c dir ";
        } else {
            osCommand = "/bin/ls ";
        }
        Process process = Runtime.getRuntime().exec(osCommand + data);
        process.waitFor();
    }
    private String goodG2B2_source() throws Throwable {
        String data = null;
        if (goodG2B2_private) {
            data = "foo";
        } else {
            data = null;
        }
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
