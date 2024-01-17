package testcases.CWE89_SQL_Injection.s01;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Level;
import java.sql.*;
public class CWE89_SQL_Injection__console_readLine_executeUpdate_45_bad extends AbstractTestCase {
    private String dataBad;
    private String dataGoodG2B;
    private String dataGoodB2G;
    private void badSink() throws Throwable {
        String data = dataBad;
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
    public void bad() throws Throwable {
        String data;
        data = "";
        {
            InputStreamReader readerInputStream = null;
            BufferedReader readerBuffered = null;
            try {
                readerInputStream = new InputStreamReader(System.in, "UTF-8");
                readerBuffered = new BufferedReader(readerInputStream);
                data = readerBuffered.readLine();
            } catch (IOException exceptIO) {
                IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
            } finally {
                try {
                    if (readerBuffered != null) {
                        readerBuffered.close();
                    }
                } catch (IOException exceptIO) {
                    IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                }
                try {
                    if (readerInputStream != null) {
                        readerInputStream.close();
                    }
                } catch (IOException exceptIO) {
                    IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                }
            }
        }
        dataBad = data;
        badSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
