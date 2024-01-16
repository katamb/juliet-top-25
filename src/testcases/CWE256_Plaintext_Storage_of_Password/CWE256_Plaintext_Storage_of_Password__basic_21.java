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
public class CWE256_Plaintext_Storage_of_Password__basic_21 extends AbstractTestCase {
    private boolean badPrivate = false;
    public void bad() throws Throwable {
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
        badPrivate = true;
        badSink(password);
    }
    private void badSink(String password) throws Throwable {
        if (badPrivate) {
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
    private boolean goodB2G1Private = false;
    private boolean goodB2G2Private = false;
    private boolean goodG2BPrivate = false;
    public void good() throws Throwable {
        goodB2G1();
        goodB2G2();
        goodG2B();
    }
    private void goodB2G1() throws Throwable {
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
        goodB2G1Private = false;
        goodB2G1Sink(password);
    }
    private void goodB2G1Sink(String password) throws Throwable {
        if (goodB2G1Private) {
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
    private void goodB2G2() throws Throwable {
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
        goodB2G2Private = true;
        goodB2G2Sink(password);
    }
    private void goodB2G2Sink(String password) throws Throwable {
        if (goodB2G2Private) {
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
    private void goodG2B() throws Throwable {
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
        goodG2BPrivate = true;
        goodG2BSink(password);
    }
    private void goodG2BSink(String password) throws Throwable {
        if (goodG2BPrivate) {
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