package testcases.CWE89_SQL_Injection.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.logging.Level;
public class CWE89_SQL_Injection__getCookies_Servlet_execute_42_bad extends AbstractTestCaseServlet {
    private String badSource(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "";
        {
            Cookie cookieSources[] = request.getCookies();
            if (cookieSources != null) {
                data = cookieSources[0].getValue();
            }
        }
        return data;
    }
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = badSource(request, response);
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
    private String goodG2BSource(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "foo";
        return data;
    }
    private String goodB2GSource(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "";
        {
            Cookie cookieSources[] = request.getCookies();
            if (cookieSources != null) {
                data = cookieSources[0].getValue();
            }
        }
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
