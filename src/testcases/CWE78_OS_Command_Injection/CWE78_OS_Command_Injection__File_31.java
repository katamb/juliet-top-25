package testcases.CWE78_OS_Command_Injection;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
public class CWE78_OS_Command_Injection__File_31 extends AbstractTestCase {
    public void bad() throws Throwable {
        String dataCopy;
        {
            String data;
            data = "";
            {
                File file = new File("C:\\data.txt");
                FileInputStream streamFileInput = null;
                InputStreamReader readerInputStream = null;
                BufferedReader readerBuffered = null;
                try {
                    streamFileInput = new FileInputStream(file);
                    readerInputStream = new InputStreamReader(streamFileInput, "UTF-8");
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
                    try {
                        if (streamFileInput != null) {
                            streamFileInput.close();
                        }
                    } catch (IOException exceptIO) {
                        IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
                    }
                }
            }
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
    public void good() throws Throwable {
        goodG2B();
    }
    private void goodG2B() throws Throwable {
        String dataCopy;
        {
            String data;
            data = "foo";
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