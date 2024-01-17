package testcases.CWE566_Authorization_Bypass_Through_SQL_Primary;
import testcasesupport.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.logging.Level;
public class CWE566_Authorization_Bypass_Through_SQL_Primary__Servlet_16_good extends AbstractTestCaseServlet {
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        while (true) {
            data = "10";
            break;
        }
        Connection dBConnection = IO.getDBConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        int id = 0;
        try {
            id = Integer.parseInt(data);
        } catch (NumberFormatException nfx) {
            id = -1;
        }
        try {
            preparedStatement = dBConnection.prepareStatement("select * from invoices where uid=?");
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            IO.writeString("bad() - result requested: " + data + "\n");
        } catch (SQLException exceptSql) {
            IO.logger.log(Level.WARNING, "Error executing query", exceptSql);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException exceptSql) {
                IO.logger.log(Level.WARNING, "Could not close ResultSet", exceptSql);
            }
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException exceptSql) {
                IO.logger.log(Level.WARNING, "Could not close PreparedStatement", exceptSql);
            }
            try {
                if (dBConnection != null) {
                    dBConnection.close();
                }
            } catch (SQLException exceptSql) {
                IO.logger.log(Level.WARNING, "Could not close Connection", exceptSql);
            }
        }
    }
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        goodG2B(request, response);
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
