package testcases.CWE321_Hard_Coded_Cryptographic_Key;
import testcasesupport.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
public class J18932 extends AbstractTestCase {
    public void handle() throws Throwable {
        String data;
        data = "23 ~j;asn!@#/>as";
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
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
