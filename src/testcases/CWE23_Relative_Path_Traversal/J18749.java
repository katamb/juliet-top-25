package testcases.CWE23_Relative_Path_Traversal;
import testcasesupport.*;
import java.io.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
public class J18749 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
    }
    private void processG2B() throws Throwable {
        String dataCopy;
        {
            String data;
            data = "foo";
            dataCopy = data;
        }
        {
            String data = dataCopy;
            String root;
            if (System.getProperty("os.name").toLowerCase().indexOf("win") >= 0) {
                root = "C:\\uploads\\";
            } else {
                root = "/home/user/uploads/";
            }
            if (data != null) {
                File file = new File(root + data);
                FileInputStream streamFileInputSink = null;
                InputStreamReader readerInputStreamSink = null;
                BufferedReader readerBufferdSink = null;
                if (file.exists() && file.isFile()) {
                    try {
                        streamFileInputSink = new FileInputStream(file);
                        readerInputStreamSink = new InputStreamReader(streamFileInputSink, "UTF-8");
                        readerBufferdSink = new BufferedReader(readerInputStreamSink);
                        IO.writeLine(readerBufferdSink.readLine());
                    } catch (IOException exceptIO) {
                        IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                    } finally {
                        try {
                            if (readerBufferdSink != null) {
                                readerBufferdSink.close();
                            }
                        } catch (IOException exceptIO) {
                            IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                        }
                        try {
                            if (readerInputStreamSink != null) {
                                readerInputStreamSink.close();
                            }
                        } catch (IOException exceptIO) {
                            IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                        }
                        try {
                            if (streamFileInputSink != null) {
                                streamFileInputSink.close();
                            }
                        } catch (IOException exceptIO) {
                            IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
