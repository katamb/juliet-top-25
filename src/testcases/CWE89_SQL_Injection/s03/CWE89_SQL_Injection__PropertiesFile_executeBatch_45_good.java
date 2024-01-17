package testcases.CWE89_SQL_Injection.s03;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.sql.*;
public class CWE89_SQL_Injection__PropertiesFile_executeBatch_45_good extends AbstractTestCase {
    private String dataBad;
    private String dataGoodG2B;
    private String dataGoodB2G;
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2BSink() throws Throwable {
        String data = dataGoodG2B;
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
    private void goodG2B() throws Throwable {
        String data;
        data = "foo";
        dataGoodG2B = data;
        goodG2BSink();
    }
    private void goodB2GSink() throws Throwable {
        String data = dataGoodB2G;
        if (data != null) {
            String names[] = data.split("-");
            int successCount = 0;
            Connection dbConnection = null;
            PreparedStatement sqlStatement = null;
            try {
                dbConnection = IO.getDBConnection();
                sqlStatement = dbConnection.prepareStatement("update users set hitcount=hitcount+1 where name=?");
                for (int i = 0; i < names.length; i++) {
                    sqlStatement.setString(1, names[i]);
                    sqlStatement.addBatch();
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
                    IO.logger.log(Level.WARNING, "Error closing PreparedStatement", exceptSql);
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
    private void goodB2G() throws Throwable {
        String data;
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
        dataGoodB2G = data;
        goodB2GSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
