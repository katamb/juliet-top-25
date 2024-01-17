package testcases.CWE259_Hard_Coded_Password;
import testcasesupport.*;
import java.util.logging.Level;
import java.io.*;
import javax.security.auth.kerberos.KerberosPrincipal;
import javax.security.auth.kerberos.KerberosKey;
public class CWE259_Hard_Coded_Password__kerberosKey_31_good extends AbstractTestCase {
    public void good() throws Throwable {
        goodG2B();
    }
    private void goodG2B() throws Throwable {
        String dataCopy;
        {
            String data;
            data = "";
            try {
                InputStreamReader readerInputStream = new InputStreamReader(System.in, "UTF-8");
                BufferedReader readerBuffered = new BufferedReader(readerInputStream);
                data = readerBuffered.readLine();
            } catch (IOException exceptIO) {
                IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
            }
            dataCopy = data;
        }
        {
            String data = dataCopy;
            if (data != null) {
                KerberosPrincipal principal = new KerberosPrincipal("test");
                KerberosKey key = new KerberosKey(principal, data.toCharArray(), null);
                IO.writeLine(key.toString());
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
