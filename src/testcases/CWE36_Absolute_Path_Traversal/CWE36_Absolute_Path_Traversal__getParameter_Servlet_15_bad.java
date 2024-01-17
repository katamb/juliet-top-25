package testcases.CWE36_Absolute_Path_Traversal;
import testcasesupport.*;
import java.io.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class CWE36_Absolute_Path_Traversal__getParameter_Servlet_15_bad extends AbstractTestCaseServlet {
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = null;
        switch (6) {
            case 6:
                data = request.getParameter("name");
                break;
            default:
                data = null;
                break;
        }
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
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
