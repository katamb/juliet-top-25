package testcases.CWE78_OS_Command_Injection;
import testcasesupport.*;
import javax.servlet.http.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
public class CWE78_OS_Command_Injection__database_21_good extends AbstractTestCase {
    private boolean badPrivate = false;
    private String bad_source() throws Throwable {
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
    public void good() throws Throwable {
        goodG2B1();
        goodG2B2();
    }
    private void goodG2B1() throws Throwable {
        String data;
        goodG2B1_private = false;
        data = goodG2B1_source();
        String osCommand;
        if (System.getProperty("os.name").toLowerCase().indexOf("win") >= 0) {
            osCommand = "c:\\WINDOWS\\SYSTEM32\\cmd.exe /c dir ";
        } else {
            osCommand = "/bin/ls ";
        }
        Process process = Runtime.getRuntime().exec(osCommand + data);
        process.waitFor();
    }
    private String goodG2B1_source() throws Throwable {
        String data = null;
        if (goodG2B1_private) {
            data = null;
        } else {
            data = "foo";
        }
        return data;
    }
    private void goodG2B2() throws Throwable {
        String data;
        goodG2B2_private = true;
        data = goodG2B2_source();
        String osCommand;
        if (System.getProperty("os.name").toLowerCase().indexOf("win") >= 0) {
            osCommand = "c:\\WINDOWS\\SYSTEM32\\cmd.exe /c dir ";
        } else {
            osCommand = "/bin/ls ";
        }
        Process process = Runtime.getRuntime().exec(osCommand + data);
        process.waitFor();
    }
    private String goodG2B2_source() throws Throwable {
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
