package testcases.CWE83_XSS_Attribute;
import testcasesupport.*;
import javax.servlet.http.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
public class CWE83_XSS_Attribute__Servlet_database_31 extends AbstractTestCaseServlet {
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String dataCopy;
        {
            String data;
            data = "";
            {
                Connection connection = null;
                PreparedStatement preparedStatement = null;
                ResultSet resultSet = null;
                try {
                    connection = IO.getDBConnection();
                    preparedStatement = connection.prepareStatement("select name from users where id=0");
                    resultSet = preparedStatement.executeQuery();
                    data = resultSet.getString(1);
                } catch (SQLException exceptSql) {
                    IO.logger.log(Level.WARNING, "Error with SQL statement", exceptSql);
                } finally {
                    try {
                        if (resultSet != null) {
                            resultSet.close();
                        }
                    } catch (SQLException exceptSql) {
                        IO.logger.log(Level.WARNING, "Error closing ResultSet", exceptSql);
                    }
                    try {
                        if (preparedStatement != null) {
                            preparedStatement.close();
                        }
                    } catch (SQLException exceptSql) {
                        IO.logger.log(Level.WARNING, "Error closing PreparedStatement", exceptSql);
                    }
                    try {
                        if (connection != null) {
                            connection.close();
                        }
                    } catch (SQLException exceptSql) {
                        IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
                    }
                }
            }
            dataCopy = data;
        }
        {
            String data = dataCopy;
            if (data != null) {
                response.getWriter().println("<br>bad() - <img src=\"" + data + "\">");
            }
        }
    }
    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        goodG2B(request, response);
    }
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String dataCopy;
        {
            String data;
            data = "foo";
            dataCopy = data;
        }
        {
            String data = dataCopy;
            if (data != null) {
                response.getWriter().println("<br>bad() - <img src=\"" + data + "\">");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}