package testcases.CWE36_Absolute_Path_Traversal;
import testcasesupport.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
public class J19097 extends AbstractTestCase {
    private void processG2B() throws Throwable {
        String data;
        data = "foo";
        for (int i = 0; i < 1; i++) {
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
    }
    public void process() throws Throwable {
        processG2B();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
