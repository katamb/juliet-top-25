package testcases.CWE190_Integer_Overflow.s01;
import testcasesupport.*;
import javax.servlet.http.*;
public class J13373 extends AbstractTestCase {
    private void processG2B1() throws Throwable {
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
    private void processG2B2() throws Throwable {
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
    private void processB2G1() throws Throwable {
        byte data;
        switch (6) {
            case 6:
                data = Byte.MAX_VALUE;
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
    private void processB2G2() throws Throwable {
        byte data;
        switch (6) {
            case 6:
                data = Byte.MAX_VALUE;
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
