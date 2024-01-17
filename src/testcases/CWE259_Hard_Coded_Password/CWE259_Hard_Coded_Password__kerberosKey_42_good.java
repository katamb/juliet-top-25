package testcases.CWE259_Hard_Coded_Password;
import testcasesupport.*;
import java.util.logging.Level;
import java.io.*;
import javax.security.auth.kerberos.KerberosPrincipal;
import javax.security.auth.kerberos.KerberosKey;
public class CWE259_Hard_Coded_Password__kerberosKey_42_good extends AbstractTestCase {
    private String badSource() throws Throwable {
        String data;
        data = "7e5tc4s3";
        return data;
    }
    private String goodG2BSource() throws Throwable {
        String data;
        data = "";
        try {
            InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
            BufferedReader readerBuffered = new BufferedReader(readerInputStream);
            data = readerBuffered.readLine();
        } catch (IOException exceptIO) {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        }
        return data;
    }
    private void goodG2B() throws Throwable {
        String data = goodG2BSource();
        if (data != null) {
            KerberosPrincipal principal = new KerberosPrincipal("test");
            KerberosKey key = new KerberosKey(principal, data.toCharArray(), null);
            IO.writeLine(key.toString());
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
