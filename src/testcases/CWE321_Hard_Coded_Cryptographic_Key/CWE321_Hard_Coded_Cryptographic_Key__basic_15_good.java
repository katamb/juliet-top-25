package testcases.CWE321_Hard_Coded_Cryptographic_Key;
import testcasesupport.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
public class CWE321_Hard_Coded_Cryptographic_Key__basic_15_good extends AbstractTestCase {
    private void goodG2B1() throws Throwable {
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
            String stringToEncrypt = "Super secret Squirrel";
            byte[] byteStringToEncrypt = stringToEncrypt.getBytes("UTF-8");
            SecretKeySpec secretKeySpec = new SecretKeySpec(data.getBytes("UTF-8"), "AES");
            Cipher aesCipher = Cipher.getInstance("AES");
            aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] byteCipherText = aesCipher.doFinal(byteStringToEncrypt);
            IO.writeLine(IO.toHex(byteCipherText));
        }
    }
    private void goodG2B2() throws Throwable {
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
            String stringToEncrypt = "Super secret Squirrel";
            byte[] byteStringToEncrypt = stringToEncrypt.getBytes("UTF-8");
            SecretKeySpec secretKeySpec = new SecretKeySpec(data.getBytes("UTF-8"), "AES");
            Cipher aesCipher = Cipher.getInstance("AES");
            aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] byteCipherText = aesCipher.doFinal(byteStringToEncrypt);
            IO.writeLine(IO.toHex(byteCipherText));
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
