package testcases.CWE259_Hard_Coded_Password;
import testcasesupport.*;
import java.util.logging.Level;
import java.io.*;
import java.net.PasswordAuthentication;
public class J18917 extends AbstractTestCase {
    private void processG2B1() throws Throwable {
        String data = null;
        switch (5) {
            case 6:
                data = null;
                break;
            default:
                data = "";
                try {
                    InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
                    BufferedReader readerBuffered = new BufferedReader(readerInputStream);
                    data = readerBuffered.readLine();
                } catch (IOException exceptIO) {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                }
                break;
        }
        if (data != null) {
            PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
            IO.writeLine(credentials.toString());
        }
    }
    private void processG2B2() throws Throwable {
        String data = null;
        switch (6) {
            case 6:
                data = "";
                try {
                    InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
                    BufferedReader readerBuffered = new BufferedReader(readerInputStream);
                    data = readerBuffered.readLine();
                } catch (IOException exceptIO) {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                }
                break;
            default:
                data = null;
                break;
        }
        if (data != null) {
            PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
            IO.writeLine(credentials.toString());
        }
    }
    public void process() throws Throwable {
        processG2B1();
        processG2B2();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
