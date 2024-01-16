package testcases.CWE129_Improper_Validation_of_Array_Index.s01;
import testcasesupport.*;
import javax.servlet.http.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
public class CWE129_Improper_Validation_of_Array_Index__database_array_write_no_check_12 extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = Integer.MIN_VALUE;
            {
                Connection connection = null;
                PreparedStatement preparedStatement = null;
                ResultSet resultSet = null;
                try {
                    connection = IO.getDBConnection();
                    preparedStatement = connection.prepareStatement("select name from users where id=0");
                    resultSet = preparedStatement.executeQuery();
                    String stringNumber = resultSet.getString(1);
                    if (stringNumber != null)  {
                        try {
                            data = Integer.parseInt(stringNumber.trim());
                        } catch (NumberFormatException exceptNumberFormat) {
                            IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                        }
                    }
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
            data = 2;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            int array[] = {0, 1, 2, 3, 4};
            array[data] = 42;
        } else {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0 && data < array.length) {
                array[data] = 42;
            } else {
                IO.writeLine("Array index out of bounds");
            }
        }
    }
    private void goodG2B() throws Throwable {
        int data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = 2;
        } else {
            data = 2;
        }
        if (IO.staticReturnsTrueOrFalse()) {
            int array[] = {0, 1, 2, 3, 4};
            array[data] = 42;
        } else {
            int array[] = {0, 1, 2, 3, 4};
            array[data] = 42;
        }
    }
    private void goodB2G() throws Throwable {
        int data;
        if (IO.staticReturnsTrueOrFalse()) {
            data = Integer.MIN_VALUE;
            {
                Connection connection = null;
                PreparedStatement preparedStatement = null;
                ResultSet resultSet = null;
                try {
                    connection = IO.getDBConnection();
                    preparedStatement = connection.prepareStatement("select name from users where id=0");
                    resultSet = preparedStatement.executeQuery();
                    String stringNumber = resultSet.getString(1);
                    if (stringNumber != null)  {
                        try {
                            data = Integer.parseInt(stringNumber.trim());
                        } catch (NumberFormatException exceptNumberFormat) {
                            IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                        }
                    }
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
            data = Integer.MIN_VALUE;
            {
                Connection connection = null;
                PreparedStatement preparedStatement = null;
                ResultSet resultSet = null;
                try {
                    connection = IO.getDBConnection();
                    preparedStatement = connection.prepareStatement("select name from users where id=0");
                    resultSet = preparedStatement.executeQuery();
                    String stringNumber = resultSet.getString(1);
                    if (stringNumber != null)  {
                        try {
                            data = Integer.parseInt(stringNumber.trim());
                        } catch (NumberFormatException exceptNumberFormat) {
                            IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                        }
                    }
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
        }
        if (IO.staticReturnsTrueOrFalse()) {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0 && data < array.length) {
                array[data] = 42;
            } else {
                IO.writeLine("Array index out of bounds");
            }
        } else {
            int array[] = {0, 1, 2, 3, 4};
            if (data >= 0 && data < array.length) {
                array[data] = 42;
            } else {
                IO.writeLine("Array index out of bounds");
            }
        }
    }
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}