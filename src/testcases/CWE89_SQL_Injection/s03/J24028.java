package testcases.CWE89_SQL_Injection.s03;
import testcasesupport.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.logging.Level;
public class J24028 extends AbstractTestCaseServlet {
    private String dataB;
    private String dataGdG2B;
    private String dataGdB2G;
    private void badSink(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = dataB;
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
    public void handle(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        data = request.getParameter("name");
        dataB = data;
        badSink(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
