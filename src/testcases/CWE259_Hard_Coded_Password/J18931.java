package testcases.CWE259_Hard_Coded_Password;
import testcasesupport.*;
import java.util.logging.Level;
import java.io.*;
import java.net.PasswordAuthentication;
public class J18931 extends AbstractTestCase {
    private String dataB;
    private String dataGdG2B;
    public void process() throws Throwable {
        processG2B();
    }
    private void gG2BSink() throws Throwable {
        String data = dataGdG2B;
        if (data != null) {
            PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
            IO.writeLine(credentials.toString());
        }
    }
    private void processG2B() throws Throwable {
        String data;
        data = "";
        try {
            InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
            BufferedReader readerBuffered = new BufferedReader(readerInputStream);
            data = readerBuffered.readLine();
        } catch (IOException exceptIO) {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        }
        dataGdG2B = data;
        gG2BSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
