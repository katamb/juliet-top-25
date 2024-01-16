package testcases.CWE259_Hard_Coded_Password;
import testcasesupport.*;
import java.util.logging.Level;
import java.io.*;
import java.net.PasswordAuthentication;
public class CWE259_Hard_Coded_Password__passwordAuth_12 extends AbstractTestCase {
    public void bad() throws Throwable {
        String data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = "7e5tc4s3";
        } else {
            data = "";
            try {
                InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
                BufferedReader readerBuffered = new BufferedReader(readerInputStream);
                data = readerBuffered.readLine();
            } catch (IOException exceptIO) {
                IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
            }
        }
        if (data != null) {
            PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
            IO.writeLine(credentials.toString());
        }
    }
    private void goodG2B() throws Throwable {
        String data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = "";
            try {
                InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
                BufferedReader readerBuffered = new BufferedReader(readerInputStream);
                data = readerBuffered.readLine();
            } catch (IOException exceptIO) {
                IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
            }
        } else {
            data = "";
            try {
                InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
                BufferedReader readerBuffered = new BufferedReader(readerInputStream);
                data = readerBuffered.readLine();
            } catch (IOException exceptIO) {
                IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
            }
        }
        if (data != null) {
            PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
            IO.writeLine(credentials.toString());
        }
    }
    public void good() throws Throwable {
        goodG2B();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}