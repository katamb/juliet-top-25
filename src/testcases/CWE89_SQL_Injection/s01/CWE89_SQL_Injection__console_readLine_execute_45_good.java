package testcases.CWE89_SQL_Injection.s01;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Level;
import java.sql.*;
public class CWE89_SQL_Injection__console_readLine_execute_45_good extends AbstractTestCase {
    private String dataBad;
    private String dataGoodG2B;
    private String dataGoodB2G;
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2BSink() throws Throwable {
        String data = dataGoodG2B;
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
    private void goodG2B() throws Throwable {
        String data;
        data = "foo";
        dataGoodG2B = data;
        goodG2BSink();
    }
    private void goodB2GSink() throws Throwable {
        String data = dataGoodB2G;
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
    private void goodB2G() throws Throwable {
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
        dataGoodB2G = data;
        goodB2GSink();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
