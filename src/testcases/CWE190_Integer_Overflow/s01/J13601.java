package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
public class J13601 extends AbstractTestCase {
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void processG2B() throws Throwable {
        int dataCopy;
        {
            int data;
            data = 2;
            dataCopy = data;
        }
        {
            int data = dataCopy;
            int result = (int) (data + 1);
            IO.writeLine("result: " + result);
        }
    }
    private void processB2G() throws Throwable {
        int dataCopy;
        {
            int data;
            data = Integer.MIN_VALUE;
            {
                Socket socket = null;
                BufferedReader readerBuffered = null;
                InputStreamReader readerInputStream = null;
                try {
                    socket = new Socket("host.example.org", 39544);
                    readerInputStream = new InputStreamReader(socket.getInputStream(), "UTF-8");
                    readerBuffered = new BufferedReader(readerInputStream);
                    String stringNumber = readerBuffered.readLine();
                    if (stringNumber != null)  {
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
                    try {
                        if (socket != null) {
                            socket.close();
                        }
                    } catch (IOException exceptIO) {
                        IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO);
                    }
                }
            }
            dataCopy = data;
        }
        {
            int data = dataCopy;
            if (data < Integer.MAX_VALUE) {
                int result = (int) (data + 1);
                IO.writeLine("result: " + result);
            } else {
                IO.writeLine("data value is too large to perform addition.");
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
