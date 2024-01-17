package testcases.CWE606_Unchecked_Loop_Condition;
import testcasesupport.*;
import javax.servlet.http.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
public class CWE606_Unchecked_Loop_Condition__database_15_good extends AbstractTestCase {
    private void goodG2B1() throws Throwable {
        String data;
        switch (5) {
            case 6:
                data = null;
                break;
            default:
                data = "5";
                break;
        }
        switch (7) {
            case 7:
                int numberOfLoops;
                try {
                    numberOfLoops = Integer.parseInt(data);
                } catch (NumberFormatException exceptNumberFormat) {
                    IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
                    numberOfLoops = 1;
                }
                for (int i = 0; i < numberOfLoops; i++) {
                    IO.writeLine("hello world");
                }
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void goodG2B2() throws Throwable {
        String data;
        switch (6) {
            case 6:
                data = "5";
                break;
            default:
                data = null;
                break;
        }
        switch (7) {
            case 7:
                int numberOfLoops;
                try {
                    numberOfLoops = Integer.parseInt(data);
                } catch (NumberFormatException exceptNumberFormat) {
                    IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
                    numberOfLoops = 1;
                }
                for (int i = 0; i < numberOfLoops; i++) {
                    IO.writeLine("hello world");
                }
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void goodB2G1() throws Throwable {
        String data;
        switch (6) {
            case 6:
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
                int numberOfLoops;
                try {
                    numberOfLoops = Integer.parseInt(data);
                } catch (NumberFormatException exceptNumberFormat) {
                    IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
                    numberOfLoops = 1;
                }
                if (numberOfLoops >= 0 && numberOfLoops <= 5) {
                    for (int i = 0; i < numberOfLoops; i++) {
                        IO.writeLine("hello world");
                    }
                }
                break;
        }
    }
    private void goodB2G2() throws Throwable {
        String data;
        switch (6) {
            case 6:
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
            break;
            default:
                data = null;
                break;
        }
        switch (7) {
            case 7:
                int numberOfLoops;
                try {
                    numberOfLoops = Integer.parseInt(data);
                } catch (NumberFormatException exceptNumberFormat) {
                    IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
                    numberOfLoops = 1;
                }
                if (numberOfLoops >= 0 && numberOfLoops <= 5) {
                    for (int i = 0; i < numberOfLoops; i++) {
                        IO.writeLine("hello world");
                    }
                }
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    public void good() throws Throwable {
        goodG2B1();
        goodG2B2();
        goodB2G1();
        goodB2G2();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
