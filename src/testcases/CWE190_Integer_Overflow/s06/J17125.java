package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Level;
public class J17125 extends AbstractTestCase {
    private short badSource() throws Throwable {
        short data;
        data = -1;
        BufferedReader readerBuffered = null;
        InputStreamReader readerInputStream = null;
        try {
            readerInputStream = new InputStreamReader(System.in, "UTF-8");
            readerBuffered = new BufferedReader(readerInputStream);
            String stringNumber = readerBuffered.readLine();
            if (stringNumber != null) {
                data = Short.parseShort(stringNumber.trim());
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
    private short goodG2BSource() throws Throwable {
        short data;
        data = 2;
        return data;
    }
    private void processG2B() throws Throwable {
        short data = goodG2BSource();
        data++;
        short result = (short) (data);
        IO.writeLine("result: " + result);
    }
    private short goodB2GSource() throws Throwable {
        short data;
        data = -1;
        BufferedReader readerBuffered = null;
        InputStreamReader readerInputStream = null;
        try {
            readerInputStream = new InputStreamReader(System.in, "UTF-8");
            readerBuffered = new BufferedReader(readerInputStream);
            String stringNumber = readerBuffered.readLine();
            if (stringNumber != null) {
                data = Short.parseShort(stringNumber.trim());
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
    private void processB2G() throws Throwable {
        short data = goodB2GSource();
        if (data < Short.MAX_VALUE) {
            data++;
            short result = (short) (data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to increment.");
        }
    }
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
