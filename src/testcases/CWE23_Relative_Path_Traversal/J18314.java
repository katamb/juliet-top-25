package testcases.CWE23_Relative_Path_Traversal;
import testcasesupport.*;
import java.io.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Level;
public class J18314 extends AbstractTestCase {
    private String dataB;
    private String dataGdG2B;
    private void bS() throws Throwable {
        String data = dataB;
        String root;
        if (System.getProperty("os.name").toLowerCase().indexOf("win") >= 0) {
            root = "C:\\uploads\\";
        } else {
            root = "/home/user/uploads/";
        }
        if (data != null) {
            File file = new File(root + data);
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
    public void handle() throws Throwable {
        String data;
        data = "";
        {
            InputStreamReader readerInputStream = null;
            BufferedReader readerBuffered = null;
            try {
                readerInputStream = new InputStreamReader(System.in, "UTF-8");
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
        dataB = data;
        bS();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
