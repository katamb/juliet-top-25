package testcases.CWE89_SQL_Injection.s04;
import testcasesupport.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.logging.Level;
public class J24817 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void goodG2BSink(String data) throws Throwable {
        Connection dbConnection = null;
        Statement sqlStatement = null;
        ResultSet resultSet = null;
        try {
            dbConnection = IO.getDBConnection();
            sqlStatement = dbConnection.createStatement();
            resultSet = sqlStatement.executeQuery("select * from users where name='" + data + "'");
            IO.writeLine(resultSet.getRow());
        } catch (SQLException exceptSql) {
            IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException exceptSql) {
                IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql);
            }
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
    private void processG2B() throws Throwable {
        String data;
        data = "foo";
        goodG2BSink(data);
    }
    private void goodB2GSink(String data) throws Throwable {
        Connection dbConnection = null;
        PreparedStatement sqlStatement = null;
        ResultSet resultSet = null;
        try {
            dbConnection = IO.getDBConnection();
            sqlStatement = dbConnection.prepareStatement("select * from users where name=?");
            sqlStatement.setString(1, data);
            resultSet = sqlStatement.executeQuery();
            IO.writeLine(resultSet.getRow());
        } catch (SQLException exceptSql) {
            IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException exceptSql) {
                IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql);
            }
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
    private void processB2G() throws Throwable {
        String data;
        data = System.getProperty("user.home");
        goodB2GSink(data);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
