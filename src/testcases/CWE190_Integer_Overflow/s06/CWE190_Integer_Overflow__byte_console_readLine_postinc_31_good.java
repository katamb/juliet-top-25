package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Level;
public class CWE190_Integer_Overflow__byte_console_readLine_postinc_31_good extends AbstractTestCase {
    public void good() throws Throwable {
        goodG2B();
        goodB2G();
    }
    private void goodG2B() throws Throwable {
        byte dataCopy;
        {
            byte data;
            data = 2;
            dataCopy = data;
        }
        {
            byte data = dataCopy;
            data++;
            byte result = (byte) (data);
            IO.writeLine("result: " + result);
        }
    }
    private void goodB2G() throws Throwable {
        byte dataCopy;
        {
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
            dataCopy = data;
        }
        {
            byte data = dataCopy;
            if (data < Byte.MAX_VALUE) {
                data++;
                byte result = (byte) (data);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to increment.");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
