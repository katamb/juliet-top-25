package testcases.CWE81_XSS_Error_Message;
import testcasesupport.*;
import javax.servlet.http.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
public class J21820 extends AbstractTestCaseServlet {
    private boolean badPrivate = false;
    public void handle(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        badPrivate = true;
        data = bad_source(request, response);
        if (data != null) {
            response.sendError(404, "<br>handle() - Parameter name has value " + data);
        }
    }
    private String bad_source(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data;
        if (badPrivate) {
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
        } else {
            data = null;
        }
        return data;
    }
    private boolean goodG2B1_private = false;
    private boolean goodG2B2_private = false;
    private String goodG2B1_source(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = null;
        if (goodG2B1_private) {
            data = null;
        } else {
            data = "foo";
        }
        return data;
    }
    private String goodG2B2_source(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String data = null;
        if (goodG2B2_private) {
            data = "foo";
        } else {
            data = null;
        }
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
