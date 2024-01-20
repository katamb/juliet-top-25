package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Level;
public class J17992 extends AbstractTestCase {
    public void handle() throws Throwable {
        long data;
        switch (6) {
            case 6:
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
                break;
            default:
                data = 0L;
                break;
        }
        switch (7) {
            case 7:
                long result = (long) (++data);
                IO.writeLine("result: " + result);
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
