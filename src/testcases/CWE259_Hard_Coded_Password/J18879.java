package testcases.CWE259_Hard_Coded_Password;
import testcasesupport.*;
import java.util.logging.Level;
import java.io.*;
import javax.security.auth.kerberos.KerberosPrincipal;
import javax.security.auth.kerberos.KerberosKey;
public class J18879 extends AbstractTestCase {
    private boolean bPrivate = false;
    private String bad_source() throws Throwable {
        String data;
        if (bPrivate) {
            data = "7e5tc4s3";
        } else {
            data = null;
        }
        return data;
    }
    private boolean goodG2B1_private = false;
    private boolean goodG2B2_private = false;
    public void process() throws Throwable {
        processG2B1();
        processG2B2();
    }
    private void processG2B1() throws Throwable {
        String data;
        goodG2B1_private = false;
        data = goodG2B1_source();
        if (data != null) {
            KerberosPrincipal principal = new KerberosPrincipal("test");
            KerberosKey key = new KerberosKey(principal, data.toCharArray(), null);
            IO.writeLine(key.toString());
        }
    }
    private String goodG2B1_source() throws Throwable {
        String data = null;
        if (goodG2B1_private) {
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
        return data;
    }
    private void processG2B2() throws Throwable {
        String data;
        goodG2B2_private = true;
        data = goodG2B2_source();
        if (data != null) {
            KerberosPrincipal principal = new KerberosPrincipal("test");
            KerberosKey key = new KerberosKey(principal, data.toCharArray(), null);
            IO.writeLine(key.toString());
        }
    }
    private String goodG2B2_source() throws Throwable {
        String data = null;
        if (goodG2B2_private) {
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
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
