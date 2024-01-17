package testcases.CWE89_SQL_Injection.s04;
import testcasesupport.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.logging.Level;
public class CWE89_SQL_Injection__Property_executeBatch_01_good extends AbstractTestCase {
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2B() throws Throwable {
        String data;
        data = "foo";
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
    private void goodB2G() throws Throwable {
        String data;
        data = System.getProperty("user.home");
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
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
