package testcases.CWE89_SQL_Injection.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.logging.Level;
public class CWE89_SQL_Injection__getCookies_Servlet_prepareStatement_45 extends AbstractTestCaseServlet {
    private String dataBad;
    private String dataGoodG2B;
    private String dataGoodB2G;
    private void badSink(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = dataBad;
        Connection dbConnection = null;
        PreparedStatement sqlStatement = null;
        try {
            dbConnection = IO.getDBConnection();
            sqlStatement = dbConnection.prepareStatement("insert into users (status) values ('updated') where name='" + data + "'");
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
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "";
        {
            Cookie cookieSources[] = request.getCookies();
            if (cookieSources != null) {
                data = cookieSources[0].getValue();
            }
        }
        dataBad = data;
        badSink(request, response);
    }
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        goodG2B(request, response);
        goodB2G(request, response);
    }
    private void goodG2BSink(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = dataGoodG2B;
        Connection dbConnection = null;
        PreparedStatement sqlStatement = null;
        try {
            dbConnection = IO.getDBConnection();
            sqlStatement = dbConnection.prepareStatement("insert into users (status) values ('updated') where name='" + data + "'");
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
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "foo";
        dataGoodG2B = data;
        goodG2BSink(request, response);
    }
    private void goodB2GSink(HttpServletRequest request, HttpServletResponse response) throws Throwable {
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
    private void goodB2G(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = "";
        {
            Cookie cookieSources[] = request.getCookies();
            if (cookieSources != null) {
                data = cookieSources[0].getValue();
            }
        }
        dataGoodB2G = data;
        goodB2GSink(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}