package testcases.CWE606_Unchecked_Loop_Condition;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
public class J20407 extends AbstractTestCase {
    private void processG2B1() throws Throwable {
        String data;
        switch (5) {
            case 6:
                data = null;
                break;
            default:
                data = "5";
                break;
        }
        switch (7) {
            case 7:
                int numberOfLoops;
                try {
                    numberOfLoops = Integer.parseInt(data);
                } catch (NumberFormatException exceptNumberFormat) {
                    IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
                    numberOfLoops = 1;
                }
                for (int i = 0; i < numberOfLoops; i++) {
                    IO.writeLine("hello world");
                }
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void processG2B2() throws Throwable {
        String data;
        switch (6) {
            case 6:
                data = "5";
                break;
            default:
                data = null;
                break;
        }
        switch (7) {
            case 7:
                int numberOfLoops;
                try {
                    numberOfLoops = Integer.parseInt(data);
                } catch (NumberFormatException exceptNumberFormat) {
                    IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
                    numberOfLoops = 1;
                }
                for (int i = 0; i < numberOfLoops; i++) {
                    IO.writeLine("hello world");
                }
                break;
            default:
                IO.writeLine("Benign, fixed string");
                break;
        }
    }
    private void processB2G1() throws Throwable {
        String data;
        switch (6) {
            case 6:
                data = "";
            {
                URLConnection urlConnection = (new URL("http://www.example.org/")).openConnection();
                BufferedReader readerBuffered = null;
                InputStreamReader readerInputStream = null;
                try {
                    readerInputStream = new InputStreamReader(urlConnection.getInputStream(), "UTF-8");
                    readerBuffered = new BufferedReader(readerInputStream);
                    data = readerBuffered.readLine();
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
                data = null;
                break;
        }
        switch (8) {
            case 7:
                IO.writeLine("Benign, fixed string");
                break;
            default:
                int numberOfLoops;
                try {
                    numberOfLoops = Integer.parseInt(data);
                } catch (NumberFormatException exceptNumberFormat) {
                    IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
                    numberOfLoops = 1;
                }
                if (numberOfLoops >= 0 && numberOfLoops <= 5) {
                    for (int i = 0; i < numberOfLoops; i++) {
                        IO.writeLine("hello world");
                    }
                }
                break;
        }
    }
    private void processB2G2() throws Throwable {
        String data;
        switch (6) {
            case 6:
                data = "";
            {
                URLConnection urlConnection = (new URL("http://www.example.org/")).openConnection();
                BufferedReader readerBuffered = null;
                InputStreamReader readerInputStream = null;
                try {
                    readerInputStream = new InputStreamReader(urlConnection.getInputStream(), "UTF-8");
                    readerBuffered = new BufferedReader(readerInputStream);
                    data = readerBuffered.readLine();
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
                data = null;
                break;
        }
        switch (7) {
            case 7:
                int numberOfLoops;
                try {
                    numberOfLoops = Integer.parseInt(data);
                } catch (NumberFormatException exceptNumberFormat) {
                    IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
                    numberOfLoops = 1;
                }
                if (numberOfLoops >= 0 && numberOfLoops <= 5) {
                    for (int i = 0; i < numberOfLoops; i++) {
                        IO.writeLine("hello world");
                    }
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
