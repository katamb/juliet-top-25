package testcases.CWE190_Integer_Overflow.s06;
import testcasesupport.*;
import javax.servlet.http.*;
import java.security.SecureRandom;
public class J16893 extends AbstractTestCase {
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
                data++;
                int result = (int) (data);
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
                data++;
                int result = (int) (data);
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
                data = (new SecureRandom()).nextInt();
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
                    data++;
                    int result = (int) (data);
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
                data = (new SecureRandom()).nextInt();
                break;
            default:
                data = 0;
                break;
        }
        switch (7) {
            case 7:
                if (data < Integer.MAX_VALUE) {
                    data++;
                    int result = (int) (data);
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
