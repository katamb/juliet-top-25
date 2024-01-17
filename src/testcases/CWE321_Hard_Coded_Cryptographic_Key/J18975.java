package testcases.CWE321_Hard_Coded_Cryptographic_Key;
import testcasesupport.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
public class J18975 extends AbstractTestCase {
    private String dataB;
    private String dataGdG2B;
    public void process() throws Throwable {
        processG2B();
    }
    private void gG2BSink() throws Throwable {
        String data = dataGdG2B;
        if (data != null) {
            String stringToEncrypt = "Super secret Squirrel";
            byte[] byteStringToEncrypt = stringToEncrypt.getBytes("UTF-8");
            SecretKeySpec secretKeySpec = new SecretKeySpec(data.getBytes("UTF-8"), "AES");
            Cipher aesCipher = Cipher.getInstance("AES");
            aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] byteCipherText = aesCipher.doFinal(byteStringToEncrypt);
            IO.writeLine(IO.toHex(byteCipherText));
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
