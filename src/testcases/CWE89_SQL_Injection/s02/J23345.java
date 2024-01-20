package testcases.CWE89_SQL_Injection.s02;
import testcasesupport.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.logging.Level;
public class J23345 extends AbstractTestCase {
    private void processG2B1() throws Throwable {
        String data;
        if (IO.staticFalse) {
            data = null;
        } else {
            data = "foo";
        }
        if (IO.staticTrue) {
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
    }
    private void processG2B2() throws Throwable {
        String data;
        if (IO.staticTrue) {
            data = "foo";
        } else {
            data = null;
        }
        if (IO.staticTrue) {
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
    }
    private void processB2G1() throws Throwable {
        String data;
        if (IO.staticTrue) {
            data = System.getenv("ADD");
        } else {
            data = null;
        }
        if (IO.staticFalse) {
            IO.writeLine("Benign, fixed string");
        } else {
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
    }
    private void processB2G2() throws Throwable {
        String data;
        if (IO.staticTrue) {
            data = System.getenv("ADD");
        } else {
            data = null;
        }
        if (IO.staticTrue) {
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
    }
    public void process() throws Throwable {
        processG2B1();
        processG2B2();
        processB2G1();
        processB2G2();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
