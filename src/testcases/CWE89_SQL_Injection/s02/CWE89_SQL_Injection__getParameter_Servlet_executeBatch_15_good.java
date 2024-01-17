package testcases.CWE89_SQL_Injection.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.logging.Level;
public class CWE89_SQL_Injection__getParameter_Servlet_executeBatch_15_good extends AbstractTestCaseServlet {
    private void goodG2B1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
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
    private void goodG2B2(HttpServletRequest request, HttpServletResponse response) throws Throwable {
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
    private void goodB2G1(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        switch (6) {
            case 6:
                data = request.getParameter("name");
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
    private void goodB2G2(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        switch (6) {
            case 6:
                data = request.getParameter("name");
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
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        goodG2B1(request, response);
        goodG2B2(request, response);
        goodB2G1(request, response);
        goodB2G2(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
