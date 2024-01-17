package testcases.CWE89_SQL_Injection.s04;
import testcasesupport.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.logging.Level;
public class CWE89_SQL_Injection__Property_execute_17_good extends AbstractTestCase {
    private void goodG2B() throws Throwable {
        String data;
        data = "foo";
        for (int j = 0; j < 1; j++) {
            Connection dbConnection = null;
            Statement sqlStatement = null;
            try {
                dbConnection = IO.getDBConnection();
                sqlStatement = dbConnection.createStatement();
                Boolean result = sqlStatement.execute("insert into users (status) values ('updated') where name='" + data + "'");
                if (result) {
                    IO.writeLine("Name, " + data + ", updated successfully");
                } else {
                    IO.writeLine("Unable to update records for user: " + data);
                }
            } catch (SQLException exceptSql) {
                IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql);
            } finally {
                try {
                    if (sqlStatement != null) {
                        sqlStatement.close();
                    }
                } catch (SQLException exceptSql) {
                    IO.logger.log(Level.WARNING, "Error closing Statement", exceptSql);
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
        for (int k = 0; k < 1; k++) {
            Connection dbConnection = null;
            PreparedStatement sqlStatement = null;
            try {
                dbConnection = IO.getDBConnection();
                sqlStatement = dbConnection.prepareStatement("insert into users (status) values ('updated') where name=?");
                sqlStatement.setString(1, data);
                Boolean result = sqlStatement.execute();
                if (result) {
                    IO.writeLine("Name, " + data + ", updated successfully");
                } else {
                    IO.writeLine("Unable to update records for user: " + data);
                }
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
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
