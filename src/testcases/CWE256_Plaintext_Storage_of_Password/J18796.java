package testcases.CWE256_Plaintext_Storage_of_Password;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.logging.Level;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
public class J18796 extends AbstractTestCase {
    private String bSce() throws Throwable {
        String password;
        password = "";
        Properties properties = new Properties();
        FileInputStream streamFileInput = null;
        try {
            streamFileInput = new FileInputStream("../common/config.properties");
            properties.load(streamFileInput);
            password = properties.getProperty("password");
        } catch (IOException exceptIO) {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        } finally {
            try {
                if (streamFileInput != null) {
                    streamFileInput.close();
                }
            } catch (IOException exceptIO) {
                IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
            }
        }
        return password;
    }
    public void handle() throws Throwable {
        String password = bSce();
        Connection dBConnection = null;
        try {
            dBConnection = DriverManager.getConnection("192.168.105.23", "sa", password);
        } catch (SQLException exceptSql) {
            IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql);
        } finally {
            try {
                if (dBConnection != null) {
                    dBConnection.close();
                }
            } catch (SQLException exceptSql) {
                IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
            }
        }
    }
    private String processG2BSce() throws Throwable {
        String password;
        password = "";
        Properties properties = new Properties();
        FileInputStream streamFileInput = null;
        try {
            streamFileInput = new FileInputStream("../common/config.properties");
            properties.load(streamFileInput);
            password = properties.getProperty("password");
        } catch (IOException exceptIO) {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        } finally {
            try {
                if (streamFileInput != null) {
                    streamFileInput.close();
                }
            } catch (IOException exceptIO) {
                IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
            }
        }
        {
            Cipher aesCipher = Cipher.getInstance("AES");
            SecretKeySpec secretKeySpec = new SecretKeySpec("ABCDEFGHABCDEFGH".getBytes("UTF-8"), "AES");
            aesCipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
            String decryptedPassword = new String(aesCipher.doFinal(password.getBytes("UTF-8")), "UTF-8");
            password = decryptedPassword;
        }
        return password;
    }
    private String processB2GSce() throws Throwable {
        String password;
        password = "";
        Properties properties = new Properties();
        FileInputStream streamFileInput = null;
        try {
            streamFileInput = new FileInputStream("../common/config.properties");
            properties.load(streamFileInput);
            password = properties.getProperty("password");
        } catch (IOException exceptIO) {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        } finally {
            try {
                if (streamFileInput != null) {
                    streamFileInput.close();
                }
            } catch (IOException exceptIO) {
                IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
            }
        }
        return password;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
