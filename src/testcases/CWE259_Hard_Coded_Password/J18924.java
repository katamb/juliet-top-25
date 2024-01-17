package testcases.CWE259_Hard_Coded_Password;
import testcasesupport.*;
import java.util.logging.Level;
import java.io.*;
import java.net.PasswordAuthentication;
public class J18924 extends AbstractTestCase {
    public void handle() throws Throwable {
        String dataCopy;
        {
            String data;
            data = "7e5tc4s3";
            dataCopy = data;
        }
        {
            String data = dataCopy;
            if (data != null) {
                PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
                IO.writeLine(credentials.toString());
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
