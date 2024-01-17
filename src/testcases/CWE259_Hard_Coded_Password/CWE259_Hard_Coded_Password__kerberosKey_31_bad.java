package testcases.CWE259_Hard_Coded_Password;
import testcasesupport.*;
import java.util.logging.Level;
import java.io.*;
import javax.security.auth.kerberos.KerberosPrincipal;
import javax.security.auth.kerberos.KerberosKey;
public class CWE259_Hard_Coded_Password__kerberosKey_31_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        String dataCopy;
        {
            String data;
            data = "7e5tc4s3";
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
