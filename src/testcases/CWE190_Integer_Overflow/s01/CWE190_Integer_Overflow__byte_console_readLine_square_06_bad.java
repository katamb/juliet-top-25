package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Level;
public class CWE190_Integer_Overflow__byte_console_readLine_square_06_bad extends AbstractTestCase {
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;
    public void bad() throws Throwable {
        byte data;
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
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
        } else {
            data = 0;
        }
        if (PRIVATE_STATIC_FINAL_FIVE == 5) {
            byte result = (byte) (data * data);
            IO.writeLine("result: " + result);
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
