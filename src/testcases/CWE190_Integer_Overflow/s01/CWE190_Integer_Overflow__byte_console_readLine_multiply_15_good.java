package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Level;
public class CWE190_Integer_Overflow__byte_console_readLine_multiply_15_good extends AbstractTestCase {
    private void goodG2B1() throws Throwable {
        byte data;
        switch (5) {
            case 6:
                data = 0;
                break;
            default:
                data = 2;
                break;
        }
        switch (7) {
            case 7:
                if (data > 0)  {
                    byte result = (byte) (data * 2);
                    IO.writeLine("result: " + result);
                }
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void goodG2B2() throws Throwable {
        byte data;
        switch (6) {
            case 6:
                data = 2;
                break;
            default:
                data = 0;
                break;
        }
        switch (7) {
            case 7:
                if (data > 0)  {
                    byte result = (byte) (data * 2);
                    IO.writeLine("result: " + result);
                }
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void goodB2G1() throws Throwable {
        byte data;
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
                break;
            default:
                data = 0;
                break;
        }
        switch (8) {
            case 7:
                IO.writeLine("Benign, fixed string");
                break;
            default:
                if (data > 0)  {
                    if (data < (Byte.MAX_VALUE / 2)) {
                        byte result = (byte) (data * 2);
                        IO.writeLine("result: " + result);
                    } else {
                        IO.writeLine("data value is too large to perform multiplication.");
                    }
                }
                break;
        }
    }
    private void goodB2G2() throws Throwable {
        byte data;
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
                break;
            default:
                data = 0;
                break;
        }
        switch (7) {
            case 7:
                if (data > 0)  {
                    if (data < (Byte.MAX_VALUE / 2)) {
                        byte result = (byte) (data * 2);
                        IO.writeLine("result: " + result);
                    } else {
                        IO.writeLine("data value is too large to perform multiplication.");
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
