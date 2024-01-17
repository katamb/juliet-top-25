package testcases.CWE259_Hard_Coded_Password;
import testcasesupport.*;
import java.util.logging.Level;
import java.io.*;
import java.net.PasswordAuthentication;
public class CWE259_Hard_Coded_Password__passwordAuth_07_good extends AbstractTestCase {
    private int privateFive = 5;
    private void goodG2B1() throws Throwable {
        String data;
        if (privateFive != 5) {
            data = null;
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
    private void goodG2B2() throws Throwable {
        String data;
        if (privateFive == 5) {
            data = "";
            try {
                InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
                BufferedReader readerBuffered = new BufferedReader(readerInputStream);
                data = readerBuffered.readLine();
            } catch (IOException exceptIO) {
                IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
            }
        } else {
            data = null;
        }
        if (data != null) {
            PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
            IO.writeLine(credentials.toString());
        }
    }
    public void good() throws Throwable {
        goodG2B1();
        goodG2B2();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
