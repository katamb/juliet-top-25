package testcases.CWE36_Absolute_Path_Traversal;
import testcasesupport.*;
import java.io.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
public class J19501 extends AbstractTestCase {
    private String bSce() throws Throwable {
        String data;
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
        return data;
    }
    private String processG2BSce() throws Throwable {
        String data;
        data = "foo";
        return data;
    }
    private void processG2B() throws Throwable {
        String data = processG2BSce();
        if (data != null) {
            File file = new File(data);
            FileInputStream streamFileInputS = null;
            InputStreamReader readerInputStreamS = null;
            BufferedReader readerBufferdS = null;
            if (file.exists() && file.isFile()) {
                try {
                    streamFileInputS = new FileInputStream(file);
                    readerInputStreamS = new InputStreamReader(streamFileInputS, "UTF-8");
                    readerBufferdS = new BufferedReader(readerInputStreamS);
                    IO.writeLine(readerBufferdS.readLine());
                } catch (IOException exceptIO) {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                } finally {
                    try {
                        if (readerBufferdS != null) {
                            readerBufferdS.close();
                        }
                    } catch (IOException exceptIO) {
                        IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                    }
                    try {
                        if (readerInputStreamS != null) {
                            readerInputStreamS.close();
                        }
                    } catch (IOException exceptIO) {
                        IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                    }
                    try {
                        if (streamFileInputS != null) {
                            streamFileInputS.close();
                        }
                    } catch (IOException exceptIO) {
                        IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
                    }
                }
            }
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
