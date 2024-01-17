package testcases.CWE259_Hard_Coded_Password;
import testcasesupport.*;
import java.util.logging.Level;
import java.io.*;
import java.net.PasswordAuthentication;
public class CWE259_Hard_Coded_Password__passwordAuth_05_bad extends AbstractTestCase {
    private boolean privateTrue = true;
    private boolean privateFalse = false;
    public void bad() throws Throwable {
        String data;
        if (privateTrue) {
            data = "7e5tc4s3";
        } else {
            data = null;
        }
        if (data != null) {
            PasswordAuthentication credentials = new PasswordAuthentication("user", data.toCharArray());
            IO.writeLine(credentials.toString());
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
