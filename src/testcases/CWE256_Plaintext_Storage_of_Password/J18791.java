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
public class J18791 extends AbstractTestCase {
    private boolean bPrivate = false;
    private boolean gB2G1Private = false;
    private boolean gB2G2Private = false;
    private boolean gG2BPrivate = false;
    public void process() throws Throwable {
        processB2G1();
        processB2G2();
        processG2B();
    }
    private void processB2G1() throws Throwable {
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
        gB2G1Private = false;
        gB2G1S(password);
    }
    private void gB2G1S(String password) throws Throwable {
        if (gB2G1Private) {
            IO.writeLine("Benign, fixed string");
        } else {
            {
                Cipher aesCipher = Cipher.getInstance("AES");
                SecretKeySpec secretKeySpec = new SecretKeySpec("ABCDEFGHABCDEFGH".getBytes("UTF-8"), "AES");
                aesCipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
                String decryptedPassword = new String(aesCipher.doFinal(password.getBytes("UTF-8")), "UTF-8");
                password = decryptedPassword;
            }
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
    }
    private void processB2G2() throws Throwable {
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
        gB2G2Private = true;
        gB2G2S(password);
    }
    private void gB2G2S(String password) throws Throwable {
        if (gB2G2Private) {
            {
                Cipher aesCipher = Cipher.getInstance("AES");
                SecretKeySpec secretKeySpec = new SecretKeySpec("ABCDEFGHABCDEFGH".getBytes("UTF-8"), "AES");
                aesCipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
                String decryptedPassword = new String(aesCipher.doFinal(password.getBytes("UTF-8")), "UTF-8");
                password = decryptedPassword;
            }
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
    }
    private void processG2B() throws Throwable {
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
        gG2BPrivate = true;
        gG2BS(password);
    }
    private void gG2BS(String password) throws Throwable {
        if (gG2BPrivate) {
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
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
