package testcases.CWE89_SQL_Injection.s04;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.sql.*;
public class CWE89_SQL_Injection__PropertiesFile_execute_15 extends AbstractTestCase {
    public void bad() throws Throwable {
        String data;
        switch (6) {
            case 6:
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
            break;
            default:
                data = null;
                break;
        }
        switch (7) {
            case 7:
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
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
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
                break;
        }
    }
    private void goodB2G2() throws Throwable {
        String data;
        switch (6) {
            case 6:
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
            break;
            default:
                data = null;
                break;
        }
        switch (7) {
            case 7:
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
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
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