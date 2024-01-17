package testcases.CWE89_SQL_Injection.s04;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.sql.*;
public class CWE89_SQL_Injection__URLConnection_executeBatch_31_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        String dataCopy;
        {
            String data;
            data = "";
            {
                URLConnection urlConnection = (new URL("http://www.example.org/")).openConnection();
                BufferedReader readerBuffered = null;
                InputStreamReader readerInputStream = null;
                try {
                    readerInputStream = new InputStreamReader(urlConnection.getInputStream(), "UTF-8");
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
            dataCopy = data;
        }
        {
            String data = dataCopy;
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
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
