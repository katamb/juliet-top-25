package testcases.CWE190_Integer_Overflow.s07;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Level;
public class J17421 extends AbstractTestCase {
    private void processG2B1() throws Throwable {
        int data;
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
                int result = (int) (++data);
                IO.writeLine("result: " + result);
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void processG2B2() throws Throwable {
        int data;
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
                int result = (int) (++data);
                IO.writeLine("result: " + result);
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void processB2G1() throws Throwable {
        int data;
        switch (6) {
            case 6:
                data = Integer.MIN_VALUE;
            {
                InputStreamReader readerInputStream = null;
                BufferedReader readerBuffered = null;
                try {
                    readerInputStream = new InputStreamReader(System.in, "UTF-8");
                    readerBuffered = new BufferedReader(readerInputStream);
                    String stringNumber = readerBuffered.readLine();
                    if (stringNumber != null)
                    {
                        try {
                            data = Integer.parseInt(stringNumber.trim());
                        } catch (NumberFormatException exceptNumberFormat) {
                            IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                        }
                    }
                } catch (IOException exceptIO) {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                } finally {
                    try {
                        if (readerBuffered != null) {
                            readerBuffered.close();
                        }
                    } catch (IOException exceptIO) {
                        IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                    }
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
                if (data < Integer.MAX_VALUE) {
                    int result = (int) (++data);
                    IO.writeLine("result: " + result);
                } else {
                    IO.writeLine("data value is too large to increment.");
                }
                break;
        }
    }
    private void processB2G2() throws Throwable {
        int data;
        switch (6) {
            case 6:
                data = Integer.MIN_VALUE;
            {
                InputStreamReader readerInputStream = null;
                BufferedReader readerBuffered = null;
                try {
                    readerInputStream = new InputStreamReader(System.in, "UTF-8");
                    readerBuffered = new BufferedReader(readerInputStream);
                    String stringNumber = readerBuffered.readLine();
                    if (stringNumber != null)
                    {
                        try {
                            data = Integer.parseInt(stringNumber.trim());
                        } catch (NumberFormatException exceptNumberFormat) {
                            IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                        }
                    }
                } catch (IOException exceptIO) {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                } finally {
                    try {
                        if (readerBuffered != null) {
                            readerBuffered.close();
                        }
                    } catch (IOException exceptIO) {
                        IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                    }
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
                if (data < Integer.MAX_VALUE) {
                    int result = (int) (++data);
                    IO.writeLine("result: " + result);
                } else {
                    IO.writeLine("data value is too large to increment.");
                }
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
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
