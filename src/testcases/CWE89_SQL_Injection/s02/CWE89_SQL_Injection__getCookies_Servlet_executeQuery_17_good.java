package testcases.CWE89_SQL_Injection.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.logging.Level;
public class CWE89_SQL_Injection__getCookies_Servlet_executeQuery_17_good extends AbstractTestCaseServlet {
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "foo";
        for (int j = 0; j < 1; j++) {
            Connection dbConnection = null;
            Statement sqlStatement = null;
            ResultSet resultSet = null;
            try {
                dbConnection = IO.getDBConnection();
                sqlStatement = dbConnection.createStatement();
                resultSet = sqlStatement.executeQuery("select * from users where name='" + data + "'");
                IO.writeLine(resultSet.getRow());
            } catch (SQLException exceptSql) {
                IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql);
            } finally {
                try {
                    if (resultSet != null) {
                        resultSet.close();
                    }
                } catch (SQLException exceptSql) {
                    IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql);
                }
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
    private void goodB2G(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "";
        {
            Cookie cookieSources[] = request.getCookies();
            if (cookieSources != null) {
                data = cookieSources[0].getValue();
            }
        }
        for (int k = 0; k < 1; k++) {
            Connection dbConnection = null;
            PreparedStatement sqlStatement = null;
            ResultSet resultSet = null;
            try {
                dbConnection = IO.getDBConnection();
                sqlStatement = dbConnection.prepareStatement("select * from users where name=?");
                sqlStatement.setString(1, data);
                resultSet = sqlStatement.executeQuery();
                IO.writeLine(resultSet.getRow());
            } catch (SQLException exceptSql) {
                IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql);
            } finally {
                try {
                    if (resultSet != null) {
                        resultSet.close();
                    }
                } catch (SQLException exceptSql) {
                    IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql);
                }
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
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        goodG2B(request, response);
        goodB2G(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
