package testcases.CWE89_SQL_Injection.s03;
import testcasesupport.*;
import javax.servlet.http.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.sql.*;
public class J24630 extends AbstractTestCase {
    public void handle() throws Throwable {
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
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
