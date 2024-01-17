package testcases.CWE89_SQL_Injection.s01;
import testcasesupport.*;
import javax.servlet.http.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.sql.*;
public class J23003 extends AbstractTestCase {
    private void goodG2B1() throws Throwable {
        String data;
        switch (5) {
            case 6:
                data = null;
                break;
            default:
                data = "foo";
                break;
        }
        switch (7) {
            case 7:
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
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void goodG2B2() throws Throwable {
        String data;
        switch (6) {
            case 6:
                data = "foo";
                break;
            default:
                data = null;
                break;
        }
        switch (7) {
            case 7:
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
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void goodB2G1() throws Throwable {
        String data;
        switch (6) {
            case 6:
                data = "";
            {
                Connection connection = null;
                PreparedStatement preparedStatement = null;
                ResultSet resultSet = null;
                try {
                    connection = IO.getDBConnection();
                    preparedStatement = connection.prepareStatement("select name from users where id=0");
                    resultSet = preparedStatement.executeQuery();
                    data = resultSet.getString(1);
                } catch (SQLException exceptSql) {
                    IO.logger.log(Level.WARNING, "Error with SQL statement", exceptSql);
                } finally {
                    try {
                        if (resultSet != null) {
                            resultSet.close();
                        }
                    } catch (SQLException exceptSql) {
                        IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql);
                    }
                    try {
                        if (preparedStatement != null) {
                            preparedStatement.close();
                        }
                    } catch (SQLException exceptSql) {
                        IO.logger.log(Level.WARNING, "Error closing PreparedStatement", exceptSql);
                    }
                    try {
                        if (connection != null) {
                            connection.close();
                        }
                    } catch (SQLException exceptSql) {
                        IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
                    }
                }
            }
            break;
            default:
                data = null;
                break;
        }
        switch (8) {
            case 7:
                IO.writeLine("Benign, fixed string");
                break;
            default:
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
                break;
        }
    }
    private void goodB2G2() throws Throwable {
        String data;
        switch (6) {
            case 6:
                data = "";
            {
                Connection connection = null;
                PreparedStatement preparedStatement = null;
                ResultSet resultSet = null;
                try {
                    connection = IO.getDBConnection();
                    preparedStatement = connection.prepareStatement("select name from users where id=0");
                    resultSet = preparedStatement.executeQuery();
                    data = resultSet.getString(1);
                } catch (SQLException exceptSql) {
                    IO.logger.log(Level.WARNING, "Error with SQL statement", exceptSql);
                } finally {
                    try {
                        if (resultSet != null) {
                            resultSet.close();
                        }
                    } catch (SQLException exceptSql) {
                        IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql);
                    }
                    try {
                        if (preparedStatement != null) {
                            preparedStatement.close();
                        }
                    } catch (SQLException exceptSql) {
                        IO.logger.log(Level.WARNING, "Error closing PreparedStatement", exceptSql);
                    }
                    try {
                        if (connection != null) {
                            connection.close();
                        }
                    } catch (SQLException exceptSql) {
                        IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
                    }
                }
            }
            break;
            default:
                data = null;
                break;
        }
        switch (7) {
            case 7:
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
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    public void process() throws Throwable {
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
