package testcases.CWE36_Absolute_Path_Traversal;
import testcasesupport.*;
import java.io.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class J19227 extends AbstractTestCaseServlet {
    private void processG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        while (true) {
            data = "foo";
            break;
        }
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
    public void process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        processG2B(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
