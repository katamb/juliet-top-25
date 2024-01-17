package testcases.CWE89_SQL_Injection.s03;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.sql.*;
public class CWE89_SQL_Injection__PropertiesFile_executeBatch_04_bad extends AbstractTestCase {
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;
    public void bad() throws Throwable {
        String data;
        if (PRIVATE_STATIC_FINAL_TRUE) {
            data = "";
            {
                Properties properties = new Properties();
                FileInputStream streamFileInput = null;
                try {
                    streamFileInput = new FileInputStream("../common/config.properties");
                    properties.load(streamFileInput);
                    data = properties.getProperty("data");
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
            }
        } else {
            data = null;
        }
        if (PRIVATE_STATIC_FINAL_TRUE) {
            if (data != null) {
                String names[] = data.split("-");
                int successCount = 0;
                Connection dbConnection = null;
                Statement sqlStatement = null;
                try {
                    dbConnection = IO.getDBConnection();
                    sqlStatement = dbConnection.createStatement();
                    for (int i = 0; i < names.length; i++) {
                        sqlStatement.addBatch("update users set hitcount=hitcount+1 where name='" + names[i] + "'");
                    }
                    int resultsArray[] = sqlStatement.executeBatch();
                    for (int i = 0; i < names.length; i++) {
                        if (resultsArray[i] > 0) {
                            successCount++;
                        }
                    }
                    IO.writeLine("Succeeded in " + successCount + " out of " + names.length + " queries.");
                } catch (SQLException exceptSql) {
                    IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql);
                } finally {
                    try {
                        if (sqlStatement != null) {
                            sqlStatement.close();
                        }
                    } catch (SQLException exceptSql) {
                        IO.logger.log(Level.WARNING, "Error closing Statament", exceptSql);
                    }
                    try {
                        if (dbConnection != null) {
                            dbConnection.close();
                        }
                    } catch (SQLException exceptSql) {
                        IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
