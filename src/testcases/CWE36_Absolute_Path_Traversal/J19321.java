package testcases.CWE36_Absolute_Path_Traversal;
import testcasesupport.*;
import java.io.*;
import javax.servlet.http.*;
import java.util.StringTokenizer;
import java.util.logging.Level;
public class J19321 extends AbstractTestCaseServlet {
    public void process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        processG2B(request, response);
    }
    private void processG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String dataCopy;
        {
            String data;
            data = "foo";
            dataCopy = data;
        }
        {
            String data = dataCopy;
            if (data != null) {
                File file = new File(data);
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
