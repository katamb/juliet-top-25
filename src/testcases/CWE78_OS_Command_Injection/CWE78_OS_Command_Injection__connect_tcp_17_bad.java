package testcases.CWE78_OS_Command_Injection;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
public class CWE78_OS_Command_Injection__connect_tcp_17_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        String data;
        data = "";
        {
            Socket socket = null;
            BufferedReader readerBuffered = null;
            InputStreamReader readerInputStream = null;
            try {
                socket = new Socket("host.example.org", 39544);
                readerInputStream = new InputStreamReader(socket.getInputStream(), "UTF-8");
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
                    if (socket != null) {
                        socket.close();
                    }
                } catch (IOException exceptIO) {
                    IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO);
                }
            }
        }
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
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
