package testcases.CWE89_SQL_Injection.s04;
import testcasesupport.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.logging.Level;
public class CWE89_SQL_Injection__Property_executeUpdate_08_good extends AbstractTestCase {
    private boolean privateReturnsTrue() {
        return true;
    }
    private boolean privateReturnsFalse() {
        return false;
    }
    private void goodG2B1() throws Throwable {
        String data;
        if (privateReturnsFalse()) {
            data = null;
        } else {
            data = "foo";
        }
        if (privateReturnsTrue()) {
            Connection dbConnection = null;
            Statement sqlStatement = null;
            try {
                dbConnection = IO.getDBConnection();
                sqlStatement = dbConnection.createStatement();
                int rowCount = sqlStatement.executeUpdate("insert into users (status) values ('updated') where name='" + data + "'");
                IO.writeLine("Updated " + rowCount + " rows successfully.");
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
    private void goodG2B2() throws Throwable {
        String data;
        if (privateReturnsTrue()) {
            data = "foo";
        } else {
            data = null;
        }
        if (privateReturnsTrue()) {
            Connection dbConnection = null;
            Statement sqlStatement = null;
            try {
                dbConnection = IO.getDBConnection();
                sqlStatement = dbConnection.createStatement();
                int rowCount = sqlStatement.executeUpdate("insert into users (status) values ('updated') where name='" + data + "'");
                IO.writeLine("Updated " + rowCount + " rows successfully.");
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
    private void goodB2G1() throws Throwable {
        String data;
        if (privateReturnsTrue()) {
            data = System.getProperty("user.home");
        } else {
            data = null;
        }
        if (privateReturnsFalse()) {
            IO.writeLine("Benign, fixed string");
        } else {
            Connection dbConnection = null;
            PreparedStatement sqlStatement = null;
            try {
                dbConnection = IO.getDBConnection();
                sqlStatement = dbConnection.prepareStatement("insert into users (status) values ('updated') where name=?");
                sqlStatement.setString(1, data);
                int rowCount = sqlStatement.executeUpdate();
                IO.writeLine("Updated " + rowCount + " rows successfully.");
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
    private void goodB2G2() throws Throwable {
        String data;
        if (privateReturnsTrue()) {
            data = System.getProperty("user.home");
        } else {
            data = null;
        }
        if (privateReturnsTrue()) {
            Connection dbConnection = null;
            PreparedStatement sqlStatement = null;
            try {
                dbConnection = IO.getDBConnection();
                sqlStatement = dbConnection.prepareStatement("insert into users (status) values ('updated') where name=?");
                sqlStatement.setString(1, data);
                int rowCount = sqlStatement.executeUpdate();
                IO.writeLine("Updated " + rowCount + " rows successfully.");
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
        goodG2B1();
        goodG2B2();
        goodB2G1();
        goodB2G2();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
