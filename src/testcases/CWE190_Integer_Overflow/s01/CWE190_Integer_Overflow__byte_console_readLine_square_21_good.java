package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Level;
public class CWE190_Integer_Overflow__byte_console_readLine_square_21_good extends AbstractTestCase {
    private boolean badPrivate = false;
    private boolean goodB2G1Private = false;
    private boolean goodB2G2Private = false;
    private boolean goodG2BPrivate = false;
    public void good() throws Throwable {
        goodB2G1();
        goodB2G2();
        goodG2B();
    }
    private void goodB2G1() throws Throwable {
        byte data;
        data = -1;
        BufferedReader readerBuffered = null;
        InputStreamReader readerInputStream = null;
        try {
            readerInputStream = new InputStreamReader(System.in, "UTF-8");
            readerBuffered = new BufferedReader(readerInputStream);
            String stringNumber = readerBuffered.readLine();
            if (stringNumber != null) {
                data = Byte.parseByte(stringNumber.trim());
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
        goodB2G1Private = false;
        goodB2G1Sink(data);
    }
    private void goodB2G1Sink(byte data) throws Throwable {
        if (goodB2G1Private) {
            IO.writeLine("Benign, fixed string");
        } else {
            if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Byte.MAX_VALUE))) {
                byte result = (byte) (data * data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform squaring.");
            }
        }
    }
    private void goodB2G2() throws Throwable {
        byte data;
        data = -1;
        BufferedReader readerBuffered = null;
        InputStreamReader readerInputStream = null;
        try {
            readerInputStream = new InputStreamReader(System.in, "UTF-8");
            readerBuffered = new BufferedReader(readerInputStream);
            String stringNumber = readerBuffered.readLine();
            if (stringNumber != null) {
                data = Byte.parseByte(stringNumber.trim());
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
        goodB2G2Private = true;
        goodB2G2Sink(data);
    }
    private void goodB2G2Sink(byte data) throws Throwable {
        if (goodB2G2Private) {
            if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long) Math.sqrt(Byte.MAX_VALUE))) {
                byte result = (byte) (data * data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform squaring.");
            }
        }
    }
    private void goodG2B() throws Throwable {
        byte data;
        data = 2;
        goodG2BPrivate = true;
        goodG2BSink(data);
    }
    private void goodG2BSink(byte data) throws Throwable {
        if (goodG2BPrivate) {
            byte result = (byte) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
