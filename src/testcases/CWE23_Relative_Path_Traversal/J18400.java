package testcases.CWE23_Relative_Path_Traversal;
import testcasesupport.*;
import java.io.*;
import javax.servlet.http.*;
import java.util.logging.Level;
public class J18400 extends AbstractTestCase {
    private String bSce() throws Throwable {
        String data;
        data = System.getenv("ADD");
        return data;
    }
    public void handle() throws Throwable {
        String data = bSce();
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
    private String processG2BSce() throws Throwable {
        String data;
        data = "foo";
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
