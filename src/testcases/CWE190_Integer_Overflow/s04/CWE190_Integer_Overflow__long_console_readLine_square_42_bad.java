package testcases.CWE190_Integer_Overflow.s04;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Level;
public class CWE190_Integer_Overflow__long_console_readLine_square_42_bad extends AbstractTestCase {
    private long badSource() throws Throwable {
        long data;
        data = -1;
        BufferedReader readerBuffered = null;
        InputStreamReader readerInputStream = null;
        try {
            readerInputStream = new InputStreamReader(System.in, "UTF-8");
            readerBuffered = new BufferedReader(readerInputStream);
            String stringNumber = readerBuffered.readLine();
            if (stringNumber != null) {
                data = Long.parseLong(stringNumber.trim());
            }
        } catch (IOException exceptIO) {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        } catch (NumberFormatException exceptNumberFormat) {
            IO.logger.log(Level.WARNING, "Error with number parsing", exceptNumberFormat);
        } finally {
            try {
                if (readerBuffered != null) {
                    readerBuffered.close();
                }
            } catch (IOException exceptIO) {
                IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
            } finally {
                try {
                    if (readerInputStream != null) {
                        readerInputStream.close();
                    }
                } catch (IOException exceptIO) {
                    IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                }
            }
        }
        return data;
    }
    public void bad() throws Throwable {
        long data = badSource();
        long result = (long) (data * data);
        IO.writeLine("result: " + result);
    }
    private long goodG2BSource() throws Throwable {
        long data;
        data = 2;
        return data;
    }
    private long goodB2GSource() throws Throwable {
        long data;
        data = -1;
        BufferedReader readerBuffered = null;
        InputStreamReader readerInputStream = null;
        try {
            readerInputStream = new InputStreamReader(System.in, "UTF-8");
            readerBuffered = new BufferedReader(readerInputStream);
            String stringNumber = readerBuffered.readLine();
            if (stringNumber != null) {
                data = Long.parseLong(stringNumber.trim());
            }
        } catch (IOException exceptIO) {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        } catch (NumberFormatException exceptNumberFormat) {
            IO.logger.log(Level.WARNING, "Error with number parsing", exceptNumberFormat);
        } finally {
            try {
                if (readerBuffered != null) {
                    readerBuffered.close();
                }
            } catch (IOException exceptIO) {
                IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
            } finally {
                try {
                    if (readerInputStream != null) {
                        readerInputStream.close();
                    }
                } catch (IOException exceptIO) {
                    IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                }
            }
        }
        return data;
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
