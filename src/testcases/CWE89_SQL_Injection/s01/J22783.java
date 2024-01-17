package testcases.CWE89_SQL_Injection.s01;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Level;
import java.sql.*;
public class J22783 extends AbstractTestCase {
    private void processG2B1() throws Throwable {
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
    private void processG2B2() throws Throwable {
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
    private void processB2G1() throws Throwable {
        String data;
        switch (6) {
            case 6:
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
    private void processB2G2() throws Throwable {
        String data;
        switch (6) {
            case 6:
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
        processG2B1();
        processG2B2();
        processB2G1();
        processB2G2();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
