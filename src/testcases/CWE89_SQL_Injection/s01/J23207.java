package testcases.CWE89_SQL_Injection.s01;
import testcasesupport.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.logging.Level;
public class J23207 extends AbstractTestCase {
    private int privateFive = 5;
    private void processG2B1() throws Throwable {
        String data;
        if (privateFive != 5) {
            data = null;
        } else {
            data = "foo";
        }
        if (privateFive == 5) {
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
    private void processG2B2() throws Throwable {
        String data;
        if (privateFive == 5) {
            data = "foo";
        } else {
            data = null;
        }
        if (privateFive == 5) {
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
    private void processB2G1() throws Throwable {
        String data;
        if (privateFive == 5) {
            data = System.getenv("ADD");
        } else {
            data = null;
        }
        if (privateFive != 5) {
            IO.writeLine("Benign, fixed string");
        } else {
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
        }
    }
    private void processB2G2() throws Throwable {
        String data;
        if (privateFive == 5) {
            data = System.getenv("ADD");
        } else {
            data = null;
        }
        if (privateFive == 5) {
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
