package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.logging.Level;
public class J16731 extends AbstractTestCase {
    private int dataB;
    private int dataGdG2B;
    private int dataGdB2G;
    public void process() throws Throwable {
        processG2B();
        processB2G();
    }
    private void gG2BS() throws Throwable {
        int data = dataGdG2B;
        data++;
        int result = (int) (data);
        IO.writeLine("result: " + result);
    }
    private void processG2B() throws Throwable {
        int data;
        data = 2;
        dataGdG2B = data;
        gG2BS();
    }
    private void gB2GS() throws Throwable {
        int data = dataGdB2G;
        if (data < Integer.MAX_VALUE) {
            data++;
            int result = (int) (data);
            IO.writeLine("result: " + result);
        } else {
            IO.writeLine("data value is too large to increment.");
        }
    }
    private void processB2G() throws Throwable {
        int data;
        data = Integer.MIN_VALUE;
        {
            ServerSocket listener = null;
            Socket socket = null;
            BufferedReader readerBuffered = null;
            InputStreamReader readerInputStream = null;
            try {
                listener = new ServerSocket(39543);
                socket = listener.accept();
                readerInputStream = new InputStreamReader(socket.getInputStream(), "UTF-8");
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
                try {
                    if (socket != null) {
                        socket.close();
                    }
                } catch (IOException exceptIO) {
                    IO.logger.log(Level.WARNING, "Error closing Socket", exceptIO);
                }
                try {
                    if (listener != null) {
                        listener.close();
                    }
                } catch (IOException exceptIO) {
                    IO.logger.log(Level.WARNING, "Error closing ServerSocket", exceptIO);
                }
            }
        }
        dataGdB2G = data;
        gB2GS();
    }
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        mainFromParent(args);
    }
}
