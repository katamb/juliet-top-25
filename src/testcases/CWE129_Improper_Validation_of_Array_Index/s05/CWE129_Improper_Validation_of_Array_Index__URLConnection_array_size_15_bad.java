package testcases.CWE129_Improper_Validation_of_Array_Index.s05;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
public class CWE129_Improper_Validation_of_Array_Index__URLConnection_array_size_15_bad extends AbstractTestCase {
    public void bad() throws Throwable {
        int data;
        switch (6) {
            case 6:
                data = Integer.MIN_VALUE;
            {
                URLConnection urlConnection = (new URL("http://www.example.org/")).openConnection();
                BufferedReader readerBuffered = null;
                InputStreamReader readerInputStream = null;
                try {
                    readerInputStream = new InputStreamReader(urlConnection.getInputStream(), "UTF-8");
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
                int array[] = null;
                if (data >= 0) {
                    array = new int[data];
                } else {
                    IO.writeLine("Array size is negative");
                }
                array[0] = 5;
                IO.writeLine(array[0]);
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
